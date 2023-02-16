import { injectGlobal } from 'vue-styled-components'

injectGlobal`
  html {
    box-sizing: border-box;
  }

  *,
  *::before,
  *::after {
    box-sizing: inherit;
  }

  body {
    margin: 0;
    line-height: 1.5;
    font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
      Oxygen-Sans, Ubuntu, Cantarell, "Helvetica Neue", Helvetica, Arial,
      sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #4e4e4e;
  }

  @font-face {
    font-family: 'Open Sans';
    src: url(${require('./fonts/OpenSans/OpenSans-Bold.woff2')}) format("woff2"),
         url(${require('./fonts/OpenSans/OpenSans-Bold.woff')}) format("woff");
    font-weight: bold;
    font-style: normal;
  }

  @font-face {
    font-family: 'Open Sans';
    src: url(${require('./fonts/OpenSans/OpenSans-Light.woff2')}) format("woff2"),
         url(${require('./fonts/OpenSans/OpenSans-Light.woff')}) format("woff");
    font-weight: 300;
    font-style: normal;
  }

  @font-face {
    font-family: 'Open Sans';
    src: url(${require('./fonts/OpenSans/OpenSans-Regular.woff2')}) format("woff2"),
         url(${require('./fonts/OpenSans/OpenSans-Regular.woff')}) format("woff");
    font-weight: normal;
    font-style: normal;
  }

  @font-face {
    font-family: 'Rubrik';
    src: url(${require('./fonts/Rubrik/RubrikBold.woff2')}) format("woff2"),
         url(${require('./fonts/Rubrik/RubrikBold.woff')}) format("woff");
    font-weight: bold;
    font-style: normal;
  }

  @font-face {
    font-family: 'Rubrik';
    src: url(${require('./fonts/Rubrik/RubrikLight.woff2')}) format("woff2"),
         url(${require('./fonts/Rubrik/RubrikLight.woff')}) format("woff");
    font-weight: 300;
    font-style: normal;
  }

  @font-face {
    font-family: 'Rubrik';
    src: url(${require('./fonts/Rubrik/Rubrik.woff2')}) format("woff2"),
         url(${require('./fonts/Rubrik/Rubrik.woff')}) format("woff");
    font-weight: normal;
    font-style: normal;
  }

  @font-face {
    font-family: 'Rubrik';
    src: url(${require('./fonts/Rubrik/RubrikBold.woff2')}) format("woff2"),
         url(${require('./fonts/Rubrik/RubrikBold.woff')}) format("woff");
    font-weight: bold;
    font-style: normal;
  }

  @font-face {
    font-family: 'Rubrik';
    src: url(${require('./fonts/Rubrik/RubrikLight.woff2')}) format("woff2"),
         url(${require('./fonts/Rubrik/RubrikLight.woff')}) format("woff");
    font-weight: 300;
    font-style: normal;
  }

  @font-face {
    font-family: 'Rubrik';
    src: url(${require('./fonts/Rubrik/Rubrik.woff2')}) format("woff2"),
         url(${require('./fonts/Rubrik/Rubrik.woff')}) format("woff");
    font-weight: normal;
    font-style: normal;
  }

  h1,h2,h3,h4,h5,h6 {
    margin-top: 0;
    font-weight: 400;
  }

  a { 
    text-decoration: none; 
  }

  a:hover,
  a:focus { 
    text-decoration: underline;
  }

  ul,ol {
    margin-top: 0;
    padding-left: 1rem;
  }

  /* Utility classes */
  .container {
    width: 100%;
    max-width: 1000px;
    margin: 0 auto;
    padding: 0 20px;
  }

  .row {
    display: flex;
    flex-wrap: wrap;
  }

  .col-md {
    width: 100%;

    @media (min-width: 768px) {
      flex-basis: 0;
      flex-grow: 1;
      max-width: 100%;
    }
  }

  .float-left {
    float: left !important;
  }

  .float-right {
    float: right !important;
  }

  .mt-0 {
    margin-top: 0 !important;
  }

  .mr-0 {
    margin-right: 0 !important;
  }

  .mb-0 {
    margin-bottom: 0 !important;
  }

  .ml-0 {
    margin-left: 0 !important;
  }

  .mt-1 {
    margin-top: 0.5rem !important;
  }

  .mr-1 {
    margin-right: 0.5rem !important;
  }

  .mb-1 {
    margin-bottom: 0.5rem !important;
  }

  .ml-1 {
    margin-left: 0.5rem !important;
  }

  .mt-2 {
    margin-top: 1rem !important;
  }

  .mr-2 {
    margin-right: 1rem !important;
  }

  .mb-2 {
    margin-bottom: 1rem !important;
  }

  .ml-2 {
    margin-left: 1rem !important;
  }

  .bg-w {
    background-color: #fff;
  }
  main > div div.col-md:nth-child(2){
    font-size:15px;
  }
`
