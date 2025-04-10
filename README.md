# CarTrawler Assessment Application

This is a Java-based application that processes car data and displays results based on specific objectives.

## Features
- Processes a list of car data.
- Filters and sorts car results based on predefined objectives.
- Displays the processed results in a user-friendly format.

## Prerequisites
- Java 17 or higher
- Gradle 7.x or higher

### Navigate to the project directory
- src/main/java: Contains the main application code.
- java/com/cartrawler/assessment/app/AssessmentRunner.java: The main entry point of the application.
- src/test/java: Contains the test cases.
- build.gradle: Gradle build configuration file.
- settings.gradle: Gradle settings file.

### Run the Application
1. `./gradlew clean build`
2. `java -jar build/libs/car-trawler-assesment-1.0-SNAPSHOT.jar`

### Application Flow
1. **Start**: The application starts with the `AssessmentRunner` class (entry point).
2. **Initialize Service**: The `Service` class is instantiated, which initializes the chain of objectives (`DuplicateRemover`, `GroupSorter`, `FullFullFilter`).
3. **Run Chain of Objectives**:
    - The `runChainOfObjectives` method in the `Service` class is called with a `Context` object.
    - The chain of objectives processes the `Context`:
        - **DuplicateRemover**: Removes duplicate car results.
        - **GroupSorter**: Sorts car results into corporate and non-corporate groups, then sorts each group by category and rental cost.
        - **FullFullFilter**: Filters out cars with `FuelPolicy.FULLFULL` that are priced above the median price within their groups.
4. **Set Processed Results**: The processed car results are set back into the `Context`.
5. **Display Results**: The results are displayed in a user-friendly format.
6. **End**: The application terminates.
