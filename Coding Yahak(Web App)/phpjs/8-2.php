<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>

    <h1>php</h1><!-- php는 서버사이드언어-->
    <?php
        $password = $_GET["password"];
        if($password == "1111")
        {
            echo "hi";
        }
        else
        {
            echo "who?";
        }
    ?>


</body>

</html>