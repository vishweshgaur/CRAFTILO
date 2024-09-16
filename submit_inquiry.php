<?php
// Database connection settings
$servername = "localhost";  // Change this if your database is hosted elsewhere
$username = "VISHWESH_GAUR";  // Replace with your MySQL username
$password = "Vishu@0710";  // Replace with your MySQL password
$dbname = "CRAFTILO";     // Replace with the name of your database

// Establish the connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check if connection was successful
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Check if form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve form data
    $name = $conn->real_escape_string($_POST['name']);
    $contact = $conn->real_escape_string($_POST['contact']);
    $email = $conn->real_escape_string($_POST['email']);
    $location = $conn->real_escape_string($_POST['location']);
    $comments = $conn->real_escape_string($_POST['comments']);

    // Insert the form data into the database
    $sql = "INSERT INTO inquiries (name, contact, email, location, comments) 
            VALUES ('$name', '$contact', '$email', '$location', '$comments')";

    // Execute the query and check if successful
    if ($conn->query($sql) === TRUE) {
        echo "Inquiry submitted successfully!";
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    // Close the connection
    $conn->close();
}
?>
