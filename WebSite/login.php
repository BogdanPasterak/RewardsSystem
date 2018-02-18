
  <?php
  $servername = "localhost";
  $usernameDb = "root";
  $passwordDb = "";
  $dbname = "rewardssystem";

  // Create connection
  $conn = new mysqli($servername, $usernameDb, $passwordDb,$dbname);
  mysqli_query($conn, "SET NAMES 'utf8'");

  $username = $_POST["UserName"];
  $password = $_POST["Password"];

  $query = 'select customerID from customers where firstName = "'.$username.'" and password = "'.$password.'"';
  $result = mysqli_query($conn, $query) or die('error: ' .mysql_error());

  if(mysqli_num_rows($result) == 1){
    echo "Success";
  } else{
    echo "Error";
  }
?>
