import React from 'react';
import '@testing-library/jest-dom';
import { render, screen } from '@testing-library/react';

import Button from '../Button';

describe('Running Test for Button', () => {
  it('Check Button Disabled', () => {
    render(<Button text="Button" disabled />);
    expect(screen.getByRole('button', { name: 'Button' })).toBeDisabled();
  });
  it('Check Button Disabled', () => {
    render(<Button text="Button" primary />);
    expect(screen.getByRole('button', { name: 'Button' })).toHaveStyle({
      backgroundColor: '#931648'
    })
  });
});


