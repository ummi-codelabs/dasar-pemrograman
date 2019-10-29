<?php 
// ceritanya user memasukan username sama password
$username = 'admin';
$password = 'garahasia';

if ( ($username == 'admin') && ($password == 'rahasia') ) {
    echo 'User berhasil login';
} else {
    echo "User gagal login";
}
