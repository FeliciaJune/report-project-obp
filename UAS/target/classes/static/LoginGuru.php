<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Guru</title>
    <style>
        body {
            font-family: sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        
        .button:hover {background-color: red !important;}
    </style>
</head>


<body>
    <form action="" method="post">
        <div class="container">
            <div class="menu"></div>
            <h1 style="font-size: 35px; margin-bottom: 10px;">Selamat Datang di Sistem Rapot Sekolah Tadika Mesra</h1>
            <p style="margin-bottom: 30px;">Anda Login sebagai Guru</p>

            <!-- Display the error message if login fails -->
            <?php if ($error) { ?>
                <div style="color: red;"><?= $error ?></div>
            <?php } ?>

            <label style="display: inline-block; width: 120px; text-align: left;" for="username">User Name</label>
            <input style="padding-top: 5px; padding-bottom: 5px; padding-left: 10px; padding-right: 10px;" type="text" id="username" name="username" placeholder="User Name" required><br><br>

            <label style="display: inline-block; width: 120px; text-align: left;" for="password">Password</label>
            <input style="padding-top: 5px; padding-bottom: 5px; padding-left: 10px; padding-right: 10px;" type="password" id="password" name="password" minlength="8" placeholder="Password" required><br><br>

            <div class="form-group">
                <input type="submit" value="Login" class="btn float-right login_btn" name="Submit">
            </div>
        </div>
    </form>
</body>
</html>
