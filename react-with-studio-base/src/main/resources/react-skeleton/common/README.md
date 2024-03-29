# Common
A package to collect shared code accross different projects and teams.

# TypeScript
TypeScript will be helpful when we build components for our library, because we will be dealing with props in React components, and defining types will avoid issues when passing props to the components.

# Rollup
We will need some custom configurations for our library. Rollup is an excellent middle ground between popular JavaScript bundlers because it is more customizable than Parcel, but requires less configuration effort than webpack.

# Storybook
We are building components, so we need a way of visualizing them in an isolated environment. Storybook does that for us because it spins up a separate playground for UI components

# Jest and React Testing Library
Jest is a complete testing framework with a test runner, plus an assertion and mocking library. It also lets the user create snapshot tests for components, which is ideal when building components in React.

React Testing Library helps us write tests as if a real user is working on the elements.

# Styling

In this project, we will not be using regular CSS; instead, we will be using CSS-in-JS. CSS-in-JS provides many benefits over regular CSS, for example:

Reusability: Because CSS-in-JS is written in JavaScript, the styles you define will be reusable JavaScript objects, and you can even extend their properties
Encapsulation: CSS-in-JS scopes are generated by unique selectors that prevent styles from leaking into other components
Dynamic: CSS-in-JS will allow you to dynamically change the properties of the styling depending on the value that the variables hold