# LanguageStudy

# Project Overview
- **Architecture**: Multi-module Architecture

# Domain
**LanguageStudy**: A language learning application.

# Dependencies

- **Kotlin**
- **Compose**
- **Hilt**
- **Room**
- **Coroutines**

# Current Status
Preparing for MVP version development.

# Design System Development
- Establishing a comprehensive design system:
    - Define design tokens
    - Define color tokens
    - Build minimal essential components (typography, buttons, etc.)
    - Create a separate sample app to verify design system functionality

# Code Style & Conventions

## Kotlin Conventions
- **Trailing Comma**: Always use trailing commas in multi-line declarations
- **If Statements**: Always use braces with line breaks (no single-line if)
- **When Statements**: Use braces for all branches, prefer `if` for 2 conditions, no `else` for enums/sealed
- **Lambda**: Always use line breaks, specify field types explicitly
- **Invoke Operator**: Use `obj()` not `obj.invoke()` for operator functions and lambdas
- **Enum Classes**: Use `SCREAMING_SNAKE_CASE` for enum entries
- **Declaration Order**: override → public → internal → protected → private (variables → functions → extensions)
- **Object/Companion**: Always declare at bottom of class/interface
- **Named Arguments**: Optional for 1 arg, required for 2+ args (Kotlin code only)
- **Comments**: Use KDoc style, link TODO comments to JIRA tickets. Do not leave comments like `//` inside functions.
- **Class Formatting**: The first line of a class should be written without a blank line.

## Compose Conventions
- **Function Naming**: Unit-returning Composables start with uppercase, value-returning with lowercase
- **Parameter Order**: Required → Modifier (first optional) → Optional → Composable slots/lambdas
- **Modifier Default**: Always use `modifier: Modifier = Modifier` (not `Modifier.something()`)
- **ViewModel Injection**: Pass ViewModels as parameters, not create inside Composables
- **Preview Functions**: Mark internal composable previews as `internal` (not `public`)
- **Event Parameters**: Use consistent naming for event handlers (`onX` pattern)

# Architecture
Following Android's official recommended app architecture with a layered approach:
- **Presentation Layer** → **Domain Layer (Optional)** → **Data Layer**

## Architectural Pattern
- **UI Pattern**: MVVM (Model-View-ViewModel)
    - Considering MVI as an alternative, but MVVM is likely to be adopted

## Layer Responsibilities

### Presentation Layer
- **Pattern**: MVVM with Jetpack Compose
- **Components**:
    - ViewModels: Business logic and state management
    - UI States: Immutable state representations
    - Contracts: Events and side effects
    - Composables: UI components
- **Dependencies**: Domain API modules only (no direct data layer access)

### Domain Layer (Optional)
- **Pattern**: UseCase-based business logic
- **When to use**:
    - Complex repository logic that needs coordination
    - Combining data from multiple repositories
    - Reusable business logic across features
- **Components**:
    - UseCases: Single-responsibility business operations
    - DomainModels: Business entities
    - Domain Mappers: Data to domain transformations
- **Dependencies**: Repository API modules only (no direct data source access)

### Data/Repository Layer
- **Pattern**: Repository pattern with API/IMPL separation
- **Components**:
    - Repository interfaces (API): Contract definitions
    - Repository implementations (IMPL): Data access logic
    - DataModels: Data transfer objects
    - Data Mappers: Network/DB to data model transformations
- **Dependencies**: DataSource API modules, domain contracts

### DataSource/Network Layer
- **Pattern**: DataSource pattern with Request/Response DTOs
- **Components**:
    - RemoteDataSource: Firebase API interactions
    - LocalDataSource: Local storage operations
    - Response DTOs: API response models
    - Request DTOs: API request parameters
- **Dependencies**: Network clients (Firebase SDK), local storage APIs


