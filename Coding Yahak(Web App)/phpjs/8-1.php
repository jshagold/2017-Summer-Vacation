<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h1>Javascript</h1>
    <script>
        password = prompt("비밀번호");
        if(password == 111)
        {
            document.write("맞아");
        }
        else
        {
            document.write("wrong");
        }
    </script>

    <form action="8-2.php">
        <p>비밀번호 입력해주세요</p>
        <input type="text" name="password">
        <input type="submit">
    </form>

    <h1>php</h1><!-- php는 서버사이드언어-->
    <?php

    ?>


</body>

</html>