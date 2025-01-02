# Quiz-Climb-JavaCore

**Quiz-Climb-JavaCore** is a Command Line Interface (CLI)-based quiz application developed using Java Core concepts. This app challenges users with a two-level quiz system that tests their knowledge and skills. It also utilizes the file system to store user data such as GR numbers and scores in a text file for persistence.

---

## Features

1. **Two Levels of Quizzes**:
   - **Basic Level**: Requires a minimum score of **7/10** to unlock the next level.
   - **Advanced Level**: Available to users who pass the basic level.

2. **User Data Storage**:
   - Stores users' **GR numbers** and their scores in a text file for future reference and tracking.

3. **Command-Line Interface**:
   - Fully interactive CLI for a seamless user experience.

---

## Technologies Used

- **Java Core**: The backbone of the application.
- **File System**: For storing user data in a `.txt` file.

---

## How It Works

1. **Start the Quiz**:
   - Users are prompted to enter their GR number to begin.

2. **Basic Level Quiz**:
   - The user answers 10 questions.
   - A score of **7/10 or higher** is required to unlock the advanced level.

3. **Advanced Level Quiz**:
   - Users who qualify proceed to the advanced level for more challenging questions.

4. **Store Results**:
   - After completing the quiz, the user's GR number and score are saved in a text file.

---

## File System Details

- **Data Storage**:
  - User data is stored in a text file named `quiz_data.txt`.
  - The file format includes:
     GR_Number: [Score]
    

---

 ## Usage

1. Launch the application using the command line.
2. Enter your GR number when prompted.
3. Complete the Basic Level quiz.
4. If qualified, proceed to the Advanced Level.
5. Your results are stored in `quiz_data.txt`.

---

## Example Output


Welcome to Quiz-Climb-JavaCore!
Enter your GR number: 123

Starting Basic Level...
Question 1: ...
...
You scored 8/10. Congratulations! You unlocked the Advanced Level.

Starting Advanced Level...
Question 1: ...
...
You scored 7/10 in the Advanced Level.

Your results have been saved. Thank you for playing Quiz-Climb-JavaCore!


---

## Future Enhancements

- Add more quiz levels for additional challenges.
- Implement user authentication for enhanced security.
- Create a graphical interface for a more interactive experience.
- Allow for category-specific quizzes.

---

 

