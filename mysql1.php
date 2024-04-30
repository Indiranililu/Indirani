<?php
$servername = "localhost";
$username = "root";
$password = "admin123";
$filename ="myDB";

// Create connection
$conn = new mysqli($servername, $username, $password,$filename);
// $sql = "CREATE DATABASE myDB";
// $sql="CREATE table user(id  int primary key,name varchar(15),age int,email varchar(50))";
// $sql="insert into user values (445,'lilu',24,'indhutamil19@gmail.com'),(446,'ram',26,'ram@gmail.com'),(447,'tamil',24,'tamil@gmail.com'),(448,'deepa',26,'deepa@gmail.com')";
// $sql="UPDATE user set name='dhana' where id=444";
$sql="insert into user values($_POST[id],'$_POST[name]',$_POST[age],'$_POST[email]')";
if ($conn->query($sql) === TRUE) {
  echo "Database created successfully";
} else {
  echo "Error creating database: " . $conn->error;
}


?>
