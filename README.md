# 🔐 OTP Generator and Login System (Java Project)

This is a beginner-friendly Java project that demonstrates the generation of a secure OTP (One-Time Password) and authenticates a user login based on it. The system provides three attempts to enter the correct OTP before denying access.

---

## 📌 Features

- ✅ Generates a secure, random OTP (default length: 10 characters)
- ✅ OTP includes:
  - Capital Letters
  - Small Letters
  - Digits
  - Special Symbols
- ✅ Displays the generated OTP for testing/demo purposes
- ✅ Allows user to input OTP with 3 attempts
- ✅ Grants access upon correct entry
- ❌ Denies access after 3 incorrect attempts

---

## 🛠 Technologies Used

- 💻 Java (JDK 8+)
- 🔄 Loops and Conditionals
- 🎲 `Random` class for OTP generation
- 📥 `Scanner` class for user input
- 🔐 Basic login authentication logic

---

## 🚀 How It Works

1. Program generates a random password/OTP.
2. OTP is shown on the screen.
3. User is asked to enter the password.
4. If entered password matches:
   - ✅ Login successful.
5. If incorrect:
   - ⚠️ Warning with remaining attempts.
   - ❌ Access denied after 3 wrong attempts.

---

## 📚 Concepts Demonstrated

- Random character generation
- Char arrays and Strings
- Basic authentication mechanism
- Console input/output
- Loops and decision-making

---
