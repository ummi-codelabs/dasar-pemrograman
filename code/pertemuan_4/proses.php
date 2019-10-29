<?php 
//pengecekan pake percabangan if-else

// input dari form
$panjang = $_POST['panjang'];
$lebar = $_POST['lebar'];
$tinggi = $_POST['tinggi'];

//proses
$volume = $panjang * $lebar * $tinggi;

//output
echo "volume dari kotak adalah " . $volume;

?>

<br>
<a href="form.php">Back</a>