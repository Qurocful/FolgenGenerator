package DreiFragezeichen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Titles {

    private int num;
    private Map<Integer, String> map;

    Titles(int n) {
        this.num = n;
    }
    public String titles(int num) {

        map = new HashMap<>();

        List<String> list = new ArrayList<>();
        // 1 - 10
        list.add("Der Super-Papagei");
        list.add("Der Phantomsee");
        list.add("Der Karpatenhund");
        list.add("Die schwarze Katze");
        list.add("Der Fluch des Rubins");
        list.add("Der Sprechende Totenkopf");
        list.add("Der unheimliche Drache");
        list.add("Der grüne Geist");
        list.add("Die rätselhaften Bilder");
        list.add("Die flüsternde Mumie");
        // 11 - 20
        list.add("Das Gespensterschloß");
        list.add("Der seltsame Wecker");
        list.add("Der lachende Schatten");
        list.add("Das Bergmonster");
        list.add("Der rasende Löwe");
        list.add("Der Zauberspiegel");
        list.add("Die gefährliche Erbschaft");
        list.add("Die Geisterinsel");
        list.add("Der Teufelsberg");
        list.add("Die flammende Spur");
        // 21 - 30
        list.add("Der tanzende Teufel");
        list.add("Der verschwundene Schatz");
        list.add("Das Aztekenschwert");
        list.add("Die silberne Spinne");
        list.add("Die singende Schlange");
        list.add("Die Silbermine");
        list.add("Der magische Kreis");
        list.add("Der Doppelgänger");
        list.add("Die Originalmusik");
        list.add("Das Riff der Haie");
        // 31 - 40
        list.add("Das Narbengesicht");
        list.add("Der Ameisenmensch");
        list.add("Die bedrohte Ranch");
        list.add("Der rote Pirat");
        list.add("Der Höhlenmensch");
        list.add("Der Super-Wal");
        list.add("Der heimliche Hehler");
        list.add("Der unsichtbare Gegner");
        list.add("Die Perlenvögel");
        list.add("Der Automarder");
        // 41 - 50
        list.add("Das Volk der Winde");
        list.add("Der weinende Sarg");
        list.add("Der höllische Werwolf");
        list.add("Der gestohlene Preis");
        list.add("Das Gold der Wikinger");
        list.add("Der schrullige Millionär");
        list.add("Der giftige Gockel");
        list.add("Die gefährlichen Fässer");
        list.add("Die Comic-Diebe");
        list.add("Der verwunschene Filmstar");
        // 51 - 60
        list.add("Der riskante Ritt");
        list.add("Die Musikpiraten");
        list.add("Die Automafia");
        list.add("Gefahr im Verzug");
        list.add("Gekaufte Spieler");
        list.add("Angriff der Computer-Viren");
        list.add("Tatort Zirkus");
        list.add("Der verrückte Maler");
        list.add("Giftiges Wasser");
        list.add("Dopingmixer");
        // 61 - 70
        list.add("Die Rache des Tigers");
        list.add("Spuk im Hotel");
        list.add("Fußball-Gangster");
        list.add("Geisterstadt");
        list.add("Diamantenschmuggel");
        list.add("Die Schattenmänner");
        list.add("Geheimnis der Särge");
        list.add("Schatz im Bergsee");
        list.add("Späte Rache");
        list.add("Schüsse aus dem Dunkel");
        // 71 - 80
        list.add("Die verschwundene Seglerin");
        list.add("Dreckiger Deal");
        list.add("Poltergeist");
        list.add("Das brennende Schwert");
        list.add("Die Spur des Raben");
        list.add("Stimmen aus dem Nichts");
        list.add("Pistenteufel");
        list.add("Das leere Grab");
        list.add("Im Bann des Voodoo");
        list.add("Geheimakte Ufo");
        // 81 - 90
        list.add("Verdeckte Fouls");
        list.add("Die Karten des Bösen");
        list.add("Meuterei auf hoher See");
        list.add("Musik des Teufels");
        list.add("Feuerturm");
        list.add("Nacht in Angst");
        list.add("Wolfsgesicht");
        list.add("Vampir im Internet");
        list.add("Tödliche Spur");
        list.add("Der Feuerteufel");
        // 91 - 100
        list.add("Labyrinth der Götter");
        list.add("Todesflug");
        list.add("Das Geisterschiff");
        list.add("Das schwarze Monster");
        list.add("Botschaft von Geisterhand");
        list.add("Der rote Rächer");
        list.add("Insektenstachel");
        list.add("Tal des Schreckens");
        list.add("Rufmord");
        list.add("Toteninsel");
        // 101 - 110
        list.add("Das Hexenhandy");
        list.add("Doppelte Täuschung");
        list.add("Das Erbe des Meisterdiebs");
        list.add("Gift per E-Mail");
        list.add("Der Nebelberg");
        list.add("Der Mann ohne Kopf");
        list.add("Der Schatz der Mönche");
        list.add("Die sieben Tore");
        list.add("Gefährliches Quiz");
        list.add("Panik im Park");
        // 111 - 120
        list.add("Die Höhle des Grauens");
        list.add("Schlucht der Dämonen");
        list.add("Das Auge des Drachen");
        list.add("Die Villa der Toten");
        list.add("Auf tödlichem Kurs");
        list.add("Codename: Cobra");
        list.add("Der finstere Rivale");
        list.add("Das düstere Vermächtnis");
        list.add("Der geheime Schlüssel");
        list.add("Der schwarze Skorpion");
        // 121 - 130
        list.add("Spur ins Nichts");
        list.add("Der Geisterzug");
        list.add("Fußballfieber");
        list.add("Geister-Canyon");
        list.add("Feuermond");
        list.add("Schrecken aus dem Moor");
        list.add("Schwarze Madonna");
        list.add("Schatten über Hollywood");
        list.add("SMS aus dem Grab");
        list.add("Der Fluch des Drachen");
        // 131 - 140
        list.add("Haus des Schreckens");
        list.add("Spuk im Netz");
        list.add("Fels der Dämonen");
        list.add("Der tote Mönch");
        list.add("Fluch des Piraten");
        list.add("Das versunkene Dorf");
        list.add("Pfad der Angst");
        list.add("Die geheime Treppe");
        list.add("Das Geheimnis der Diva");
        list.add("Stadt der Vampire");
        // 141 - 150
        list.add("Die Fußball-Falle");
        list.add("Tödliches Eis");
        list.add("Die Poker-Hölle");
        list.add("Zwillinge der Finsternis");
        list.add("Die Rache der Samurai");
        list.add("Der Biss der Bestie");
        list.add("Grusel auf Campbell Castle ");
        list.add("Die feurige Flut");
        list.add("Der namenlose Gegner");
        list.add("Geisterbucht");
        // 151 - 160
        list.add("Schwarze Sonne");
        list.add("Skateboardfieber");
        list.add("Das Fußballphantom ");
        list.add("Botschaft aus der Unterwelt");
        list.add("Der Meister des Todes");
        list.add("Im Netz des Drachen");
        list.add("Im Zeichen der Schlangen");
        list.add("Der Feuergeist");
        list.add("Nacht der Tiger");
        list.add("Geheimnisvolle Botschaften");
        // 161 - 170
        list.add("Die blutenden Bilder");
        list.add("Der schreiende Nebel");
        list.add("Der verschollene Pilot");
        list.add("Fußball-Teufel");
        list.add("Im Schatten des Giganten");
        list.add("Die brennende Stadt");
        list.add("Das blaue Biest");
        list.add("GPS-Gangster");
        list.add("Die Spur des Spielers");
        list.add("Straße des Grauens");
        // 171 - 180
        list.add("Das Phantom aus dem Meer");
        list.add("Der Eisenmann");
        list.add("Dämon der Rache");
        list.add("Das Tuch der Toten");
        list.add("Schattenwelt");
        list.add("Der gestohlene Sieg");
        list.add("Der Geist des Goldgräbers");
        list.add("Der gefiederte Schrecken");
        list.add("Die Rache des Untoten");
        list.add("Die flüsternden Puppen");
        // 181 - 190
        list.add("Das Kabinett des Zauberers");
        list.add("Im Haus des Henkers");
        list.add("Der letzte Song");
        list.add("Der Hexengarten");
        list.add("Der Mann ohne Augen");
        list.add("Insel des Vergessens");
        list.add("Das silberne Amulett");
        list.add("Signale aus dem Jenseits");
        list.add("Der unsichtbare Passagier");
        list.add("Die Kammer der Rätsel");
        // 191 - 200
        list.add("Verbrechen im Nichts ");
        list.add("Im Bann des Drachen");
        list.add("Schrecken aus der Tiefe");
        list.add("Die Zeitreisende");
        list.add("Im Reich der Ungeheuer");
        list.add("Geheimnis des Bauchredners");
        list.add("Im Auge des Sturms");
        list.add("Die Legende der Gaukler");
        list.add("Der grüne Kobold");
        list.add("Feuriges Auge");
        // 201 - 210
        list.add("Höhenangst");
        list.add("Das weiße Grab");
        list.add("Tauchgang ins Ungewisse");
        list.add("Der dunkle Wächter");
        list.add("Das rätselhafte Erbe");
        list.add("Der Mottenmann");
        list.add("Die falschen Detektive");
        list.add("Kelch des Schicksals");
        list.add("Kreaturen der Nacht");
        list.add("Die schweigende Grotte");
        // 211 - 220
        list.add("Der Jadekönig");
        list.add("Der weiße Leopard");
        list.add("Der Fluch der Medusa");
        list.add("Der Geisterbunker");
        list.add("Die verlorene Zeit");
        list.add("Die Schwingen des Unheils");
        list.add("Der Kristallschädel");
        list.add("Im Netz der Lügen");
        list.add("Die Teufelsklippe");
        list.add("Im Wald der Gefahren");
        // 221 - 222
        list.add("Manuskript des Satans");
        list.add("Die Gesetzlosen");

        for(int i = 1; i <= list.size(); i++) {
            map.put(i,list.get(i - 1));
        }

        return this.map.get(num);
    }

    public String toString() {
        return String.format("%s", this.titles(num));
    }
}
