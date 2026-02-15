package me.monty.svatek;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SvatekExpansion extends PlaceholderExpansion {

    private final Map<String, String> kalendar = new HashMap<>();

    public SvatekExpansion() {
        naplnKalendar();
    }

    @Override
    public @NotNull String getAuthor() { return "Monty"; }

    @Override
    public @NotNull String getIdentifier() { return "svatek"; }

    @Override
    public @NotNull String getVersion() { return "1.0"; }

    @Override
    public String onRequest(OfflinePlayer player, @NotNull String params) {
        LocalDate dnes = LocalDate.now();

        if (params.equalsIgnoreCase("dnes")) {
            String klic = String.format("%02d-%02d", dnes.getMonthValue(), dnes.getDayOfMonth());
            return kalendar.getOrDefault(klic, "Nikdo nemá svátek");
        }

        if (params.equalsIgnoreCase("zitra")) {
            LocalDate zitra = dnes.plusDays(1);
            String klic = String.format("%02d-%02d", zitra.getMonthValue(), zitra.getDayOfMonth());
            return kalendar.getOrDefault(klic, "Nikdo nemá svátek");
        }

        return null;
    }

    private void naplnKalendar() {
        // LEDEN
        kalendar.put("01-01", "Nový rok / Den obnovy"); kalendar.put("01-02", "Karina"); kalendar.put("01-03", "Radmila"); kalendar.put("01-04", "Diana"); kalendar.put("01-05", "Dalimil"); kalendar.put("01-06", "Tři králové"); kalendar.put("01-07", "Vilma"); kalendar.put("01-08", "Čestmír"); kalendar.put("01-09", "Vladan"); kalendar.put("01-10", "Břetislav"); kalendar.put("01-11", "Bohdana"); kalendar.put("01-12", "Pravoslav"); kalendar.put("01-13", "Edita"); kalendar.put("01-14", "Radovan"); kalendar.put("01-15", "Alice"); kalendar.put("01-16", "Ctirad"); kalendar.put("01-17", "Drahoslav"); kalendar.put("01-18", "Vladislav"); kalendar.put("01-19", "Doubravka"); kalendar.put("01-20", "Ilona"); kalendar.put("01-21", "Běla"); kalendar.put("01-22", "Slavomír"); kalendar.put("01-23", "Zdeněk"); kalendar.put("01-24", "Milena"); kalendar.put("01-25", "Miloš"); kalendar.put("01-26", "Zora"); kalendar.put("01-27", "Ingrid"); kalendar.put("01-28", "Otýlie"); kalendar.put("01-29", "Zdislava"); kalendar.put("01-30", "Robin"); kalendar.put("01-31", "Marika");

        // ÚNOR
        kalendar.put("02-01", "Hynek"); kalendar.put("02-02", "Nela"); kalendar.put("02-03", "Blažej"); kalendar.put("02-04", "Jarmila"); kalendar.put("02-05", "Dobromila"); kalendar.put("02-06", "Vanda"); kalendar.put("02-07", "Veronika"); kalendar.put("02-08", "Milada"); kalendar.put("02-09", "Apolena"); kalendar.put("02-10", "Mojmír"); kalendar.put("02-11", "Božena"); kalendar.put("02-12", "Slavěna"); kalendar.put("02-13", "Věnceslav"); kalendar.put("02-14", "Valentýn"); kalendar.put("02-15", "Jiřina"); kalendar.put("02-16", "Ljuba"); kalendar.put("02-17", "Miloslava"); kalendar.put("02-18", "Gizela"); kalendar.put("02-19", "Patrik"); kalendar.put("02-20", "Oldřich"); kalendar.put("02-21", "Lenka"); kalendar.put("02-22", "Petr"); kalendar.put("02-23", "Svatopluk"); kalendar.put("02-24", "Matěj"); kalendar.put("02-25", "Liliana"); kalendar.put("02-26", "Dorota"); kalendar.put("02-27", "Alexandr"); kalendar.put("02-28", "Lumír"); kalendar.put("02-29", "Horymír");

        // BŘEZEN
        kalendar.put("03-01", "Bedřich"); kalendar.put("03-02", "Anežka"); kalendar.put("03-03", "Kamil"); kalendar.put("03-04", "Stela"); kalendar.put("03-05", "Kazimír"); kalendar.put("03-06", "Miroslav"); kalendar.put("03-07", "Tomáš"); kalendar.put("03-08", "Gabriela"); kalendar.put("03-09", "Františka"); kalendar.put("03-10", "Viktorie"); kalendar.put("03-11", "Anděla"); kalendar.put("03-12", "Řehoř"); kalendar.put("03-13", "Růžena"); kalendar.put("03-14", "Rút / Matylda"); kalendar.put("03-15", "Ida"); kalendar.put("03-16", "Elena / Herbert"); kalendar.put("03-17", "Vlastimil"); kalendar.put("03-18", "Eduard"); kalendar.put("03-19", "Josef"); kalendar.put("03-20", "Světlana"); kalendar.put("03-21", "Radek"); kalendar.put("03-22", "Leona"); kalendar.put("03-23", "Ivona"); kalendar.put("03-24", "Gabriel"); kalendar.put("03-25", "Marián"); kalendar.put("03-26", "Emanuel"); kalendar.put("03-27", "Dita"); kalendar.put("03-28", "Soňa"); kalendar.put("03-29", "Taťána"); kalendar.put("03-30", "Arnošt"); kalendar.put("03-31", "Kvido");

        // DUBEN
        kalendar.put("04-01", "Hugo"); kalendar.put("04-02", "Erika"); kalendar.put("04-03", "Richard"); kalendar.put("04-04", "Ivana"); kalendar.put("04-05", "Miroslava"); kalendar.put("04-06", "Vendula"); kalendar.put("04-07", "Heřman / Hermína"); kalendar.put("04-08", "Ema"); kalendar.put("04-09", "Dušan"); kalendar.put("04-10", "Darja"); kalendar.put("04-11", "Izabela"); kalendar.put("04-12", "Julius"); kalendar.put("04-13", "Aleš"); kalendar.put("04-14", "Vincenc"); kalendar.put("04-15", "Anastázie"); kalendar.put("04-16", "Irena"); kalendar.put("04-17", "Rudolf"); kalendar.put("04-18", "Valérie"); kalendar.put("04-19", "Rostislav"); kalendar.put("04-20", "Marcela"); kalendar.put("04-21", "Alexandra"); kalendar.put("04-22", "Evženie"); kalendar.put("04-23", "Vojtěch"); kalendar.put("04-24", "Jiří"); kalendar.put("04-25", "Marek"); kalendar.put("04-26", "Oto"); kalendar.put("04-27", "Jaroslav"); kalendar.put("04-28", "Vlastislav"); kalendar.put("04-29", "Robert"); kalendar.put("04-30", "Blahoslav");

        // KVĚTEN
        kalendar.put("05-01", "Svátek práce"); kalendar.put("05-02", "Zikmund"); kalendar.put("05-03", "Alexej"); kalendar.put("05-04", "Květoslav"); kalendar.put("05-05", "Klaudie"); kalendar.put("05-06", "Radoslav"); kalendar.put("05-07", "Stanislav"); kalendar.put("05-08", "Den vítězství"); kalendar.put("05-09", "Ctibor"); kalendar.put("05-10", "Blažena"); kalendar.put("05-11", "Svatava"); kalendar.put("05-12", "Pankrác"); kalendar.put("05-13", "Servác"); kalendar.put("05-14", "Bonifác"); kalendar.put("05-15", "Žofie"); kalendar.put("05-16", "Přemysl"); kalendar.put("05-17", "Aneta"); kalendar.put("05-18", "Nataša"); kalendar.put("05-19", "Ivo"); kalendar.put("05-20", "Zbyšek"); kalendar.put("05-21", "Monika"); kalendar.put("05-22", "Emil"); kalendar.put("05-23", "Vladimír"); kalendar.put("05-24", "Jana"); kalendar.put("05-25", "Viola"); kalendar.put("05-26", "Filip"); kalendar.put("05-27", "Valdemar"); kalendar.put("05-28", "Vilém"); kalendar.put("05-29", "Maxmilián"); kalendar.put("05-30", "Ferdinand"); kalendar.put("05-31", "Kamila");

        // ČERVEN
        kalendar.put("06-01", "Laura"); kalendar.put("06-02", "Jarmil"); kalendar.put("06-03", "Tamara"); kalendar.put("06-04", "Dalibor"); kalendar.put("06-05", "Dobroslav"); kalendar.put("06-06", "Norbert"); kalendar.put("06-07", "Iveta / Slavav"); kalendar.put("06-08", "Medard"); kalendar.put("06-09", "Stanislava"); kalendar.put("06-10", "Gita"); kalendar.put("06-11", "Bruno"); kalendar.put("06-12", "Antonie"); kalendar.put("06-13", "Antonín"); kalendar.put("06-14", "Roland"); kalendar.put("06-15", "Vít"); kalendar.put("06-16", "Zbyněk"); kalendar.put("06-17", "Adolf"); kalendar.put("06-18", "Milan"); kalendar.put("06-19", "Leoš"); kalendar.put("06-20", "Květa"); kalendar.put("06-21", "Alois"); kalendar.put("06-22", "Pavla"); kalendar.put("06-23", "Zdeňka"); kalendar.put("06-24", "Jan"); kalendar.put("06-25", "Ivan"); kalendar.put("06-26", "Adriana"); kalendar.put("06-27", "Ladislav"); kalendar.put("06-28", "Lubomír"); kalendar.put("06-29", "Petr a Pavel"); kalendar.put("06-30", "Šárka");

        // ČERVENEC
        kalendar.put("07-01", "Jaroslava"); kalendar.put("07-02", "Patricie"); kalendar.put("07-03", "Radomír"); kalendar.put("07-04", "Prokop"); kalendar.put("07-05", "Cyril a Metoděj"); kalendar.put("07-06", "Jan Hus"); kalendar.put("07-07", "Bohuslava"); kalendar.put("07-08", "Nora"); kalendar.put("07-09", "Drahoslava"); kalendar.put("07-10", "Libuše / Amálie"); kalendar.put("07-11", "Olga"); kalendar.put("07-12", "Bořek"); kalendar.put("07-13", "Markéta"); kalendar.put("07-14", "Karolína"); kalendar.put("07-15", "Jindřich"); kalendar.put("07-16", "Luboš"); kalendar.put("07-17", "Martina"); kalendar.put("07-18", "Drahomíra"); kalendar.put("07-19", "Čeněk"); kalendar.put("07-20", "Ilja"); kalendar.put("07-21", "Vítězslav"); kalendar.put("07-22", "Magdaléna"); kalendar.put("07-23", "Libor"); kalendar.put("07-24", "Kristýna"); kalendar.put("07-25", "Jakub"); kalendar.put("07-26", "Anna"); kalendar.put("07-27", "Věroslav"); kalendar.put("07-28", "Viktor"); kalendar.put("07-29", "Marta"); kalendar.put("07-30", "Bořivoj"); kalendar.put("07-31", "Ignác");

        // SRPEN
        kalendar.put("08-01", "Oskar"); kalendar.put("08-02", "Gustav"); kalendar.put("08-03", "Miluše"); kalendar.put("08-04", "Dominik"); kalendar.put("08-05", "Kristián"); kalendar.put("08-06", "Oldřiška"); kalendar.put("08-07", "Lada"); kalendar.put("08-08", "Soběslav"); kalendar.put("08-09", "Roman"); kalendar.put("08-10", "Vavřinec"); kalendar.put("08-11", "Zuzana"); kalendar.put("08-12", "Klára"); kalendar.put("08-13", "Alena"); kalendar.put("08-14", "Alan"); kalendar.put("08-15", "Hana"); kalendar.put("08-16", "Jáchym"); kalendar.put("08-17", "Petra"); kalendar.put("08-18", "Helena"); kalendar.put("08-19", "Ludvík"); kalendar.put("08-20", "Bernard"); kalendar.put("08-21", "Johana"); kalendar.put("08-22", "Bohuslav"); kalendar.put("08-23", "Sandra"); kalendar.put("08-24", "Bartoloměj"); kalendar.put("08-25", "Radim"); kalendar.put("08-26", "Luděk"); kalendar.put("08-27", "Otakar"); kalendar.put("08-28", "Augustýn"); kalendar.put("08-29", "Evelína"); kalendar.put("08-30", "Vladěna"); kalendar.put("08-31", "Pavlína");

        // ZÁŘÍ
        kalendar.put("09-01", "Linda / Samuel"); kalendar.put("09-02", "Adéla"); kalendar.put("09-03", "Bronislav"); kalendar.put("09-04", "Jindřiška"); kalendar.put("09-05", "Boris"); kalendar.put("09-06", "Boleslav"); kalendar.put("09-07", "Regína"); kalendar.put("09-08", "Mariana"); kalendar.put("09-09", "Daniela"); kalendar.put("09-10", "Irma"); kalendar.put("09-11", "Denisa"); kalendar.put("09-12", "Marie"); kalendar.put("09-13", "Lubor"); kalendar.put("09-14", "Radka"); kalendar.put("09-15", "Jolana"); kalendar.put("09-16", "Ludmila"); kalendar.put("09-17", "Naděžda"); kalendar.put("09-18", "Kryštof"); kalendar.put("09-19", "Zita"); kalendar.put("09-20", "Oleg"); kalendar.put("09-21", "Matouš"); kalendar.put("09-22", "Darina"); kalendar.put("09-23", "Berta"); kalendar.put("09-24", "Jaromír"); kalendar.put("09-25", "Zlata"); kalendar.put("09-26", "Andrea"); kalendar.put("09-27", "Jonáš"); kalendar.put("09-28", "Václav"); kalendar.put("09-29", "Michal"); kalendar.put("09-30", "Jeroným");

        // ŘÍJEN
        kalendar.put("10-01", "Igor"); kalendar.put("10-02", "Olivie / Oliver"); kalendar.put("10-03", "Bohumil"); kalendar.put("10-04", "František"); kalendar.put("10-05", "Eliška"); kalendar.put("10-06", "Hanuš"); kalendar.put("10-07", "Justýna"); kalendar.put("10-08", "Věra"); kalendar.put("10-09", "Štefan / Sára"); kalendar.put("10-10", "Marina"); kalendar.put("10-11", "Andrej"); kalendar.put("10-12", "Marcel"); kalendar.put("10-13", "Renáta"); kalendar.put("10-14", "Agáta"); kalendar.put("10-15", "Tereza"); kalendar.put("10-16", "Havel"); kalendar.put("10-17", "Hedvika"); kalendar.put("10-18", "Lukáš"); kalendar.put("10-19", "Michaela"); kalendar.put("10-20", "Vendelín"); kalendar.put("10-21", "Brigita"); kalendar.put("10-22", "Sabina"); kalendar.put("10-23", "Teodor"); kalendar.put("10-24", "Nina"); kalendar.put("10-25", "Beáta"); kalendar.put("10-26", "Erik"); kalendar.put("10-27", "Šarlota / Zoe"); kalendar.put("10-28", "Vznik ČSR"); kalendar.put("10-29", "Silvie"); kalendar.put("10-30", "Tadeáš"); kalendar.put("10-31", "Štěpánka");

        // LISTOPAD
        kalendar.put("11-01", "Felix"); kalendar.put("11-02", "Památka zesnulých"); kalendar.put("11-03", "Hubert"); kalendar.put("11-04", "Karel"); kalendar.put("11-05", "Miriam"); kalendar.put("11-06", "Liběna"); kalendar.put("11-07", "Saskie"); kalendar.put("11-08", "Bohumír"); kalendar.put("11-09", "Bohdan"); kalendar.put("11-10", "Evžen"); kalendar.put("11-11", "Martin"); kalendar.put("11-12", "Benedikt"); kalendar.put("11-13", "Tiborc"); kalendar.put("11-14", "Sáva"); kalendar.put("11-15", "Leopold"); kalendar.put("11-16", "Otmar"); kalendar.put("11-17", "Den boje za svobodu"); kalendar.put("11-18", "Romana"); kalendar.put("11-19", "Alžběta"); kalendar.put("11-20", "Nikola"); kalendar.put("11-21", "Albert"); kalendar.put("11-22", "Cecílie"); kalendar.put("11-23", "Klement"); kalendar.put("11-24", "Emílie"); kalendar.put("11-25", "Kateřina"); kalendar.put("11-26", "Artur"); kalendar.put("11-27", "Xenie"); kalendar.put("11-28", "René"); kalendar.put("11-29", "Zina"); kalendar.put("11-30", "Ondřej");

        // PROSINEC
        kalendar.put("12-01", "Iva"); kalendar.put("12-02", "Blanka"); kalendar.put("12-03", "Svatoslav"); kalendar.put("12-04", "Barbora"); kalendar.put("12-05", "Jitka"); kalendar.put("12-06", "Mikuláš"); kalendar.put("12-07", "Ambrož"); kalendar.put("12-08", "Květoslava"); kalendar.put("12-09", "Vratislav"); kalendar.put("12-10", "Julie"); kalendar.put("12-11", "Dana"); kalendar.put("12-12", "Simona"); kalendar.put("12-13", "Lucie"); kalendar.put("12-14", "Lýdie"); kalendar.put("12-15", "Radana"); kalendar.put("12-16", "Albína"); kalendar.put("12-17", "Daniel"); kalendar.put("12-18", "Miloslav"); kalendar.put("12-19", "Ester"); kalendar.put("12-20", "Dagmar"); kalendar.put("12-21", "Natálie"); kalendar.put("12-22", "Šimon"); kalendar.put("12-23", "Vlasta"); kalendar.put("12-24", "Adam a Eva"); kalendar.put("12-25", "Boží hod"); kalendar.put("12-26", "Štěpán"); kalendar.put("12-27", "Žaneta"); kalendar.put("12-28", "Bohumila"); kalendar.put("12-29", "Judita"); kalendar.put("12-30", "David"); kalendar.put("12-31", "Silvestr");
    }
}