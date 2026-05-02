# AI Agent Instructions for Refactoring Lab

## Build and Test Commands
- Run tests: `./gradlew.bat test` (Windows) or `./gradlew test` (Unix/Linux)
- Full build: `./gradlew.bat build`
- Uses Gradle 8.7 wrapper; JUnit 5 for testing

## Code Conventions
- Package structure: `org.example`
- Standard Java naming conventions
- Note: `Calcu` class is abbreviated (Calculator); prefer full names in new code
- Refactoring in progress: methods renamed descriptively, but some variables retain old abbreviated names

## Architecture
- Domain model: `Customer`, `Item`, `Order` (immutable data classes)
- Service: `OrderProcessor` (business logic, pricing, discounts)
- Utility: `Calcu` (mathematical operations)

## Documentation Links
- [README.md](README.md) - Project setup and run instructions
- [docs/refactoring-lab.md](docs/refactoring-lab.md) - Refactoring examples and patterns

## Common Pitfalls
- Must use `gradlew.bat` on Windows (not `./gradlew`)
- Library project; no main class for standalone execution
- Tests capture `System.out` for console output verification
- JDK 21 compatible but no explicit version specified in build.gradle