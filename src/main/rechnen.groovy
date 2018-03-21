import javax.swing.*


def rechenzeichen = JOptionPane.showInputDialog('Geben sie die gewuenschte Rechenart ein')
def zahlenbereich = JOptionPane.showInputDialog('Geben sie die hoechste erwuenschte Zahl ein')

aufgabe(rechenzeichen,zahlenbereich)

void aufgabe(def rechenart, def hoechsteZahl){
    int num01 = zufallszahl(hoechsteZahl)
    int num02 = zufallszahl(hoechsteZahl)
    
    if(rechenart == '+'){
        int result = num01 + num02
        check(result, num01, num02, rechenart)
        return
    }
    else if(rechenart == '-'){
        while(num01-num02<1){
            num01 = zufallszahl(hoechsteZahl)
            num02 = zufallszahl(hoechsteZahl)
        }  
        int result = num01 - num02
        check(result, num01, num02, rechenart)
        return
    }
    else if(rechenart == '*'){
        int result = num01 * num02
        check(result, num01, num02, rechenart)
        return
    }
    else if(rechenart == '/'){
        while(num01/num02<1 || num01%num02!=0){
            num01 = zufallszahl(hoechsteZahl)
            num02 = zufallszahl(hoechsteZahl)
        }  
        int result = num01 / num02
        check(result, num01, num02, rechenart)
        return
    }
   
    
}

int zufallszahl(def num){
    int max = num.toInteger()
    return ((Math.floor(max)*Math.random()) + 1) as Integer
}

void check(int result, int num01, int num02, def rechenart){
    def antwort = JOptionPane.showInputDialog("Was ergibt $num01 $rechenart $num02?")
    int antwortInt = antwort as Integer
    if(result == antwortInt)
        println("Klasse, deine Antwort ist richtig")
    else{
        int daneben = antwortInt - result
        println("Du liegst mit deiner Antwort $daneben daneben")
    }
}