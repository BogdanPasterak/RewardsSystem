<html>
<body>

  <?php
  $servername = "localhost";
  $username = "root";
  $password = "";
  $dbname = "rewardssystem";

  // Create connection
  $conn = new mysqli($servername, $username, $password,$dbname);

  // Check connection
  if ($conn->connect_error) {
      die("Connection failed: " . $conn->connect_error);
  }
  echo "Connected successfully";

$sql = "INSERT INTO customers ( customerID, firstName, surname, password, mobileNumber, emailAddress, address, county, city) VALUES (DEFAULT,'a','b', 'p' ,'c','d','e','f','g')";

if (mysqli_query($conn, $sql)) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}

mysqli_close($conn);
?>

</body>
</html>
