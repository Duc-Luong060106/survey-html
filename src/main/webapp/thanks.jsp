<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    <style>
        label {
            width: 20em;
        }
    </style>
</head>

<body>
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    <label>Date of birth:</label>
    <span>${user.birthday}</span><br>

    <br>
    <h3>Additional Information:</h3>
    <label>How you heard about us:</label>
    <span>${hearAbout}</span><br>

    <label>Receive announcements for new CDs:</label>
    <span>${receiveNewCDs}</span><br>

    <label>Receive special offers:</label>
    <span>${receiveSpecialOffers}</span><br>

    <label>Preferred contact method:</label>
    <span>${contactType}</span><br>
    <p>To enter another survey, click on the Back button in your browser or the Return button shown below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>