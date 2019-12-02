<!DOCTYPE html>
<html lang="en">

<head>
    <title>Looping - table</title>
    <style>
        table {
            width: 300px;

        }

        table,
        th,
        td {
            border: 1px solid black;
        }

        th,
        td {
            text-align: center;
        }
    </style>
</head>

<body>
    <!--『Dasar pemrograman』 Looping - For -->
    <h3>Looping - Table</h3>

    <table>
        <thead>
            <tr>
                <th>NO</th>
                <th>NIM</th>
            </tr>
        </thead>
        <tbody>
            <?php

            for ($i = 1; $i < 10; $i++) {
                echo "<tr>";
                echo "<td> {$i} </td>";
                echo "<td> nim {$i} </td>";
                echo "</tr>";
            }

            ?>
        </tbody>
    </table>

</body>

</html>