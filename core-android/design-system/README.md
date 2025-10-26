# Design System

## Overview

This module provides the design system foundation for the LanguageStudy application, implementing a scalable and maintainable design token system. 
It establishes a consistent visual language across the app through systematically organized design tokens and reusable components.

## Responsibilities

- Define design tokens (colors, typography, spacing, etc.) as code following industry best practices
- Compose and maintain app themes with support for light and dark modes
- Implement and maintain UI components built on top of design tokens
- Provide foundation utilities for common design system needs

# Design Tokens

Design tokens are essential in creating and maintaining a consistent design language in our projects.
They contain the values you'll use to construct Ul elements, such as colors, typography, spacing, border radius, and icons.

## Primitive tokens

> name-variant
> primary-900
 
The primitive tokens have a simple name structure with two levels: name and variation.

## Component tokens

> type-category-variant
> color-background-band-subtle-...

The component tokens are the ones applied in the interface and always inherit a primitive token. 
The names of component tokens explain how they are used, 
so they are composed of three levels: type, category, and variation. 
It's possible to have more than one variation in the same token, like "brand-subtle".

## Tokens

- Colors
- Typography
- Spacing
- BorderRadius
- Icon

# Module Structure

```
design-system/
├── tokens/              # Design token definitions (primitive & component values)
│   ├── ColorToken.kt
│   ├── TypographyToken.kt
│   └── IconToken.kt ...
│
├── theme/               # Theme aggregation (composing tokens into themes)
│   ├── Theme.kt
│   ├── Colors.kt
│   ├── Typography.kt
│   └── Icon.kt ...
│
├── foundation/           # Foundation utilities
│   └── ModifierExtensions, Ripple 
│
└── component/           # UI components
    ├── Button.kt
    └── TextField.kt
```

## Package Descriptions

- **tokens**: Raw design token values (colors, typography scales, spacing units)
- **theme**: Aggregated theme objects accessible via `WinterTheme`
- **foundation**: Core utilities and helpers for the design system
- **component**: Reusable UI components built with design tokens

# Usage

