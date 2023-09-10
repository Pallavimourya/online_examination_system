<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .container {
            width: 100%;
            height: 97vh;
            overflow: hidden;
            margin: 0;
            padding: 0;
            background-color: black;
        }

        .container .result {
            min-width: 600px;
            border: 4px solid white;
            border-top-left-radius: 4px solid #fff;
            border-bottom-right-radius: 4px solid #fff;
            border-top-right-radius: 0px solid #fff;
            border-bottom-left-radius: 0px solid #fff;
            margin: 0;
            display: flex;
            flex-direction: column;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }

        .container .result span {
            font-size: 38px;
            text-align: center;
            padding: 3rem 1rem;

        }

        .container .result .totalQ {
            color: yellow;
        }

        .container .result .totalA {
            color: chartreuse;
        }

        .container .result .statusResult {
            color: #fff;
        }

        .green {
            color: chartreuse;
        }

        .red {
            color: red;
            display: none;
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="result">
            <span class="totalQ">Total Question 10</span>
            <span class="totalA">Total Attempt </span>
            <span class="statusResult">Result: <b class="green">Pass</b> <b class="red">Fail</b></span>
        </div>
    </div>
</body>

</html>