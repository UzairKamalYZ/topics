import { MouseEventHandler } from "react";
export interface ButtonProps {
  text?: string;
  href?: string;
  primary?: boolean;
  disabled?: boolean;
  size?: "small" | "medium" | "large";
  style?: object;
  theme?: string;
  onClick?: MouseEventHandler<HTMLButtonElement>;
}
