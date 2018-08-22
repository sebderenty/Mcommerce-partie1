package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {

    static String ERROR_MESSAGE = "Un produit ne peut avoir un prix de vente égal à 0";

    public ProduitGratuitException() { super(ERROR_MESSAGE); }

    public ProduitGratuitException(String s) {
        super(s);
    }
}
