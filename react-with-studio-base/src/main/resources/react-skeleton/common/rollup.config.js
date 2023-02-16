import resolve from "@rollup/plugin-node-resolve";
import commonjs from "@rollup/plugin-commonjs";
import typescript from "@rollup/plugin-typescript";
import dts from "rollup-plugin-dts";
import { terser } from "rollup-plugin-terser";
import visualizer from 'rollup-plugin-visualizer';
import copy from 'rollup-plugin-copy'

import peerDepsExternal from "rollup-plugin-peer-deps-external";
import json from '@rollup/plugin-json';

const packageJson = require("./package.json");

// 1. import default from the plugin module
const createStyledComponentsTransformer = require('typescript-plugin-styled-components').default;

// 2. create a transformer;
// the factory additionally accepts an options object which described below
const styledComponentsTransformer = createStyledComponentsTransformer();

export default [
  {
    input: "src/index.ts",
    output: [
      {
        file: packageJson.module,
        format: "esm",
        sourcemap: true,
        
      },
    ],
    plugins: [
      peerDepsExternal(),
      resolve(),
      commonjs(),
      typescript({ 
        tsconfig: "./tsconfig.json", 
        transformers: [
          () => ({
            before: [styledComponentsTransformer],
          }),
        ]
      }),
      terser(),
      json(),
      visualizer({
        filename: 'bundle-analysis.html',
        open: false,
      }),
      copy({
        targets: [
          { 
            src: './package.json', 
            dest: 'dist/esm',
            transform: (contents, filename) => contents.toString().replace('dist/esm/index.js', 'index.js')
          },
        ]
      }),
    ],
    external: ["react", "react-dom", "styled-components"],
  },
  {
    input: "dist/esm/types/index.d.ts",
    output: [{ file: "dist/esm/index.d.ts", format: "esm" }],
    plugins: [dts()],
  },
];
