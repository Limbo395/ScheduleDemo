# ScheduleDemo

This program demonstrates asynchronicity in Spring using @Scheduled and ScheduledExecutorService.

## Task

- Every 10 seconds, data in the file updated_data.txt is updated by increasing a counter by 5.
- 5 seconds after starting the program, the message "5 seconds since the program started" is displayed.

## How to Run

1. Make sure you have Java and Gradle installed.
2. Clone this repository.
3. Go to the root directory of the project.
4. Run the command to build and start the program:

   ```bash
   ./gradlew bootRun
   ```

## Expected Result

After starting the program, you will see the following output in the console:
```output
Written to file: Counter: 5
5 seconds since the program started
Written to file: Counter: 10
Written to file: Counter: 15
Written to file: Counter: 20
Written to file: Counter: 25
Written to file: Counter: 30
Written to file: Counter: 35
Written to file: Counter: 40
Written to file: Counter: 45
Written to file: Counter: 50
Written to file: Counter: 55
Written to file: Counter: 60
```

## Additional

A file named updated_data.txt will be created in the root directory of the project, containing lines with updated counter values.
