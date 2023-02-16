import React from "react";
import styled from "styled-components";
import { ButtonProps } from "./Button.types";

import designTokens from '../../assets/design-tokens.json'
import getTheme from '../../assets/themes'

const StyledLink = styled.a<ButtonProps>`
  display: inline-block;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  line-height: 1.5;
  border: 1px solid ${props => getTheme(props.theme).primary};
  border-radius: ${designTokens.borderRadiusRegular};
  cursor: pointer;
  background-color: ${props => props.primary ? getTheme(props.theme).primary : '#fff'};
  color: ${props => props.primary ? '#fff' : getTheme(props.theme).primary};
  transition: ${designTokens.transitionFast};
  text-decoration: none;
  
  &:hover,
  &:focus {
    text-decoration: none;
    background-color: ${props => {
      if (props.disabled) return ''
      if (props.primary) return (getTheme(props.theme).primaryDark)
      return (getTheme(props.theme).primary)
    }};
    color: ${props => {
      if (props.disabled || props.primary) return ''
      return ('#fff')
    }};
  }

  &:disabled {
    cursor: not-allowed;
  }
`;

const StyledButton = styled.button<ButtonProps>`
  display: inline-block;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  font-family: inherit;
  line-height: 1.5;
  border: 1px solid ${props => getTheme(props.theme).primary};
  border-radius: ${designTokens.borderRadiusRegular};
  cursor: pointer;
  background-color: ${props => props.primary ? getTheme(props.theme).primary : '#fff'};
  color: ${props => props.primary ? '#fff' : getTheme(props.theme).primary};
  transition: ${designTokens.transitionFast};

  &:hover,
  &:focus {
    text-decoration: none;
    background-color: ${props => {
      if (props.disabled) return ''
      if (props.primary) return (getTheme(props.theme).primaryDark)
      return (getTheme(props.theme).primary)
    }};
    color: ${props => {
      if (props.disabled || props.primary) return ''
      return ('#fff')
    }};
  }

  &:disabled {
      cursor: not-allowed;
  }
`;

const Button: React.FC<ButtonProps> = ({ text, primary, disabled, size, onClick, style, theme, href, ...props }) => {
  if(href?.length) {
    return (
      <StyledLink
        primary={primary}
        disabled={disabled}
        size={size}
        style={style}
        theme={theme}
        href={href}
        data-test-id={text} /* Selenium example */
        {...props}
      >
        {text}
      </StyledLink>
    );
  }

  return (
    <StyledButton
      type="button"
      onClick={onClick}
      primary={primary}
      disabled={disabled}
      size={size}
      style={style}
      theme={theme}
      {...props}
    >
      {text}
    </StyledButton>
  );
};

export default Button;
