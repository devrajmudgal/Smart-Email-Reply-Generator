# Smart-Email-Reply-Generator
# 💬 Smart Email Reply Generator

Ever stuck writing the perfect email response? This project helps you out!

**Smart Email Reply Generator** is a Java Spring Boot backend application that uses Google’s **Gemini API** to generate intelligent, context-aware replies based on your message and selected tone — like formal, informal, or witty. It’s fast, simple, and smart ✨

---

## 🚀 What It Does

- Accepts your input (email prompt/message)
- Lets you choose a tone (e.g., formal, informal, witty)
- Uses **Gemini AI** to create a smart reply tailored to your tone
- Sends back the reply instantly via a clean REST API

---

## 🧰 Built With

- **Java** & **Spring Boot** – Backend REST API
- **Gemini API** – Google’s Large Language Model (LLM)
- **Postman** – For testing endpoints
- **Maven** – Build tool

---

## 📦 Sample API Usage

### `POST /generate-reply`

Send a prompt and a tone:

```json
{
  "prompt": "Hi, are we still on for the meeting tomorrow?",
  "tone": "formal"
}
