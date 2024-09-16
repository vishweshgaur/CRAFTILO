<?php
if($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $contact = $_POST['contact'];
    $email = $_POST['email'];
    $location = $_POST['location'];
    $comments = $_POST['comments'];

    $to = "vishug730@gmail.com"; 
    $subject = "New Inquiry from Website";
    $body = "Name: $name\nContact: $contact\nEmail: $email\nLocation: $location\nComments:\n$comments";

    // Additional headers
    $headers = "From: $email";

    // Send email
    if (mail($to, $subject, $body, $headers)) {
        echo "Inquiry sent successfully!";
    } else {
        echo "Failed to send the inquiry. Please try again.";
    }
}
?>
