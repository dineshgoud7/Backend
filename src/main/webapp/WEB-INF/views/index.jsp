<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Feedback System</title>
    <style>
        /* Basic Reset */
        body, h1, h2, p, ul, li, a {
            margin: 0;
            padding: 0;
            list-style: none;
            text-decoration: none;
        }

        /* Body Styling */
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f4f4f9;
            margin: 0;
        }

        /* Header Section */
        header {
            background: #0078d7;
            color: white;
            padding: 10px 20px;
        }

        header h1 {
            text-align: center;
            font-size: 2rem;
        }

        /* Navigation Bar */
        nav {
            background: #0053a0;
            color: white;
            padding: 10px 20px;
            display: flex;
            justify-content: center;
        }

        nav ul {
            display: flex;
            gap: 20px;
        }

        nav a {
            color: white;
            font-size: 1.2rem;
            padding: 5px 10px;
            transition: background 0.3s, color 0.3s;
        }

        nav a:hover {
            background: white;
            color: #0053a0;
            border-radius: 5px;
        }

        /* Footer Section */
        footer {
            text-align: center;
            padding: 10px 20px;
            background: #0078d7;
            color: white;
            margin-top: 20px;
        }

        /* Main Content */
        main {
            text-align: center;
            padding: 20px;
        }

        .welcome {
            font-size: 1.5rem;
            margin: 20px auto;
            color: #333;
        }
    </style>
</head>
<body>
    <!-- Header Section -->
    <header>
        <h1>Welcome to the Student Feedback System</h1>
    </header>

    <!-- Navigation Bar -->
    <nav>
        <ul>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><a href="contact.jsp">Contact Us</a></li>
        </ul>
    </nav>

    <!-- Main Content -->
    <main>
        <p class="welcome">Your feedback matters. Let us know how we can improve!</p>
    </main>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 Student Feedback System. All rights reserved.</p>
    </footer>
</body>
</html>