# Car Customization System using Builder Pattern

## Problem Statement

Design a car customization system using the Builder Design Pattern where users can create cars with different configurations.

## Requirements

Each car should have the following components:
1. **Model Name** - (e.g., "Tesla Model 3", "Ford Mustang")
2. **Engine Type** - (e.g., Electric, Petrol, Diesel, Hybrid)
3. **Color** - (e.g., Red, Blue, Black)
4. **Transmission** - (e.g., Automatic, Manual)
5. **Sunroof** - (Yes/No)
6. **Infotainment System** - (Yes/No)

## Configuration Presets

### Default Car Configuration:
- **Model Name**: Default Model
- **Engine Type**: Petrol
- **Color**: White
- **Transmission**: Manual
- **Sunroof**: No
- **Infotainment System**: No

### Customized Car Configuration:
- **Model Name**: Tesla Model 3
- **Engine Type**: Electric
- **Color**: Midnight Silver
- **Transmission**: Automatic
- **Sunroof**: Yes
- **Infotainment System**: Yes

## Design Constraints

1. **Use Builder Pattern** to create car objects
2. **Two ways to create cars**:
    - Default configuration (all default values)
    - Customized configuration (user-specified values)
3. **Fluent interface** for building cars step-by-step
4. **Immutable Car objects** once built

## Tasks

1. **Car Class** - The final product with all attributes
2. **CarBuilder Class** - The builder with methods for setting each component
3. **Director Class (Optional)** - To create predefined configurations like "Default Car" and "Tesla Model 3"
4. **Main Class** - Demonstrate creating both default and customized cars

## Implementation Notes

- The builder should provide a **fluent API** (method chaining)
- Car objects should be **immutable** after construction
- Include validation in the builder (optional but good practice)
- Consider making the Car constructor **private** to force builder usage