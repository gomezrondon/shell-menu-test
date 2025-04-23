# Shell Menu Test

A Spring Boot application that demonstrates a simple interactive shell menu using Spring Shell. This project provides a command-line interface with various demonstration commands.

## Description

This application showcases the use of Spring Shell to create an interactive command-line interface with a menu-driven approach. It includes demonstration commands for common operations like logging, printing, saving, loading, and searching.

## Features

- Interactive shell menu with numbered commands
- Clear menu display
- Screen clearing functionality
- Simple demonstration commands
- Support for GraalVM native image compilation

## Prerequisites

- Java 21 or higher
- Gradle 7.x or higher
- (Optional) Docker for container deployment
- (Optional) GraalVM 22.3+ for native image compilation

## Building the Application

### Using Gradle

```bash
./gradlew build
```

This will create a JAR file in the `build/libs` directory.

### Creating a Docker Container

```bash
./gradlew bootBuildImage
```

This creates a lightweight container using Cloud Native Buildpacks.

### Creating a Native Executable

```bash
./gradlew nativeCompile
```

This creates a native executable using GraalVM's native-image compiler.

## Running the Application

### Using Java

```bash
java -jar build/libs/shell-menu-test-0.0.1-SNAPSHOT.jar
```

### Using the Batch File (Windows)

```bash
start.bat
```

### Using Docker

```bash
docker run --rm shell-menu-test:0.0.1-SNAPSHOT
```

### Using Native Executable

```bash
build/native/nativeCompile/shell-menu-test
```

## Usage

Once the application is running, you'll see a menu with the following options:

1. Logging - Demonstrates logging functionality
2. Printing - Demonstrates printing functionality
3. Saving - Demonstrates saving functionality
4. Loading - Demonstrates loading functionality
5. Search - Demonstrates search functionality

Additional commands:
- `menu` - Display the menu options
- `cls` - Clear the terminal screen
- `exit` - Exit the application

To execute a command, simply type the number or name of the command and press Enter.

## Testing

Run the tests using:

```bash
./gradlew test
```

For native image testing:

```bash
./gradlew nativeTest
```

 