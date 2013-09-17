<html>
<head>
    <title>Login Page</title>
    <style>
        .errorblock {
            color: #ff0000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<form name='loginform' action="/voucher/j_spring_security_check" method='POST'>

    <table>
        <tr>
            <td>Login:</td>
            <td><input type='text' name='j_username' value=''>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <input type='password' name='j_password'/>
            </td>
        </tr>
        <tr>
            <td>
                <input name="submit" type="submit" value="submit"/>
            </td>
        </tr>
    </table>

</form>
</body>
</html>