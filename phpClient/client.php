<?php
    if(isset($_POST['montant'])) {
        $montant = $_POST['montant'];
        $client = new SoapClient("http://127.0.0.1:9191/BankWS?wsdl");
        $param = new stdClass();
        $param->montant = $montant;
        $req = $client -> __soapCall("Convert", array($param));
        $res = $req->return;
    }
?>

<html>
    <body>
        <form method="post" action="client.php">
            <h1>Conversion Euro - DH</h1>
            <label for="montant">Montant en Euro:</label>
            <input type="number" name="montant" id="montant" value="0" min="0" required />

            <input type="submit" value="Convertir">
        </form>
        <br>
        <h1>Résultat :</h1>
        <?php
            if(isset($res)) {
                echo("<b>".$res."</b>");
            }
        ?>
    </body>
</html>

