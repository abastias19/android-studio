package com.example.adolfo.razasdeperros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;

import android.text.Editable;

import android.text.TextWatcher;

import android.widget.ArrayAdapter;

import android.widget.EditText;

import android.widget.ListView;

import java.util.ArrayList;

import java.util.Arrays;



public class MainActivity extends ActionBarActivity {

    String[] items;

    ArrayList<String> listItems;

    ArrayAdapter<String> adapter;

    ListView listView;

    EditText editText;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        editText=(EditText)findViewById(R.id.txtsearch);

        initList();

        editText.addTextChangedListener(new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence s, int start, int count, int
                    after) {


            }


            @Override

            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {

                if (s.toString().equals("")) {

                    // reset listview

                    initList();

                } else {

                    // perform search

                    searchItem(s.toString());

                }

            }


            @Override

            public void afterTextChanged(Editable s) {


            }

        });

    }



    public void searchItem(String textToSearch){

        for(String item:items){

            if(!item.contains(textToSearch)){

                listItems.remove(item);

            }

        }

        adapter.notifyDataSetChanged();

    }

    public void initList(){

        items=new String[]{        "Affenpinscher",
                "Afgano",
                "Akita",
                "Akita Americano",
                "Alano español",
                "American Bully",
                "American Foxhound",
                "American Pitbull Terrier",
                "American Staffordshire",
                "Australian Silky Terrier",
                "Azawakh",
                "Barbet",
                "Basenji",
                "Basset artesiano de Normandia",
                "Basset azul de Gascuña",
                "Basset Hound",
                "Basset Leonardo de Bretaña",
                "Beagle",
                "Beagle – Harrier",
                "Berger de Picardie",
                "Bichón Boloñés",
                "Bichón Frisé",
                "Bichón Habanero",
                "Bichón Maltés",
                "Billy",
                "Black and Tan Coonhound",
                "Bloodhound",
                "Bobtail",
                "Bodeguero Andaluz",
                "Boerboel",
                "Border Collie",
                "Border Terrier",
                "Borzoi (Galgo Ruso)",
                "Boston Terrier",
                "Bóxer",
                "Boyero Australiano",
                "Boyero de Flandes",
                "Boyero de las Ardenas",
                "Braco alemán de pelo corto",
                "Braco alemán de pelo duro",
                "Braco de Auvernia",
                "Braco de Weimar",
                "Braco del Ariège",
                "Braco del Bourbonnais",
                "Braco francés, tipo Gascuña, talla grande",
                "Braco francés, tipo Pirineos, talla pequeña",
                "Braco Italiano",
                "Braco San Germain",
                "Briard",
                "Brittany",
                "Broholmer",
                "Buhund noruego",
                "Bull Terrier",
                "Bull Terrier miniature",
                "Bulldog",
                "Bulldog Americano",
                "Bulldog francés",
                "Bullmastín",
                "Cairn Terrier",
                "Cane Corso",
                "Caniche (Poodle)",
                "Carlino",
                "Cavalier King Charles",
                "Chihuahua",
                "Chin Japonés",
                "Chow Chow",
                "Cimarrón Uruguayo",
                "Cirneco Del Etna",
                "Clumber Spaniel",
                "Cobrador de Nueva Escocia",
                "Cocker Spaniel",
                "Cocker Americano",
                "Collie",
                "Collie Barbudo",
                "Collie Smooth",
                "Corgi Galés Cárdigan",
                "Corgi Galés Pembroke",
                "Cotón de Tuléar",
                "Curly Coated Retriever (de pelo rizado)",
                "Dálmata",
                "Dandie Dinmont Terrier",
                "Deerhound Escocés",
                "Doberman",
                "Dogo Argentino",
                "Dogo Canario",
                "Dogo de Burdeos",
                "Dogo Mallorquín",
                "Drever",
                "Elkhound Noruego",
                "Epagneul breton",
                "Eurasier",
                "Faraón Hound",
                "Field Spaniel",
                "Faraón Hound",
                "Fila Brasileiro",
                "Fila de San Miguel",
                "Fox Terrier pelo duro",
                "Fox Terrier de pelo liso",
                "Fox Terrier Toy",
                "Foxhound Americano",
                "Foxhound Inglés",
                "Galgo Español",
                "Galgo Italiano",
                "Golden Retriever",
                "Gran Basset Grifón vendeano",
                "Gran Danés",
                "Greyhound",
                "Grifon Belga",
                "Grifón de Bruselas",
                "Grifón de muestra bohemio de pelo duro",
                "Grifón de muestra eslovaco de pelo duro",
                "Grifón de muestra Korthals de pelo duro",
                "Hamilton Stovare",
                "Harrier",
                "Hokkaïdo",
                "Hovawart",
                "Husky Siberiano",
                "Irish Soft Coated Wheaten Terrier",
                "Jack Russell Terrier",
                "Jamthund",
                "Kai",
                "Karjalankarhukoira",
                "Kishu",
                "Komondor",
                "Korea Jinco Dog",
                "Kromfohrländer",
                "Kuvasz",
                "Labrador Retriever",
                "Laïka de Siberia oriental",
                "Laïka Ruso-Europeo",
                "Lakeland Terrier",
                "Landseer",
                "Lebrel Húngaro",
                "Leonberger",
                "Lhasa Apso",
                "Lundehund",
                "Löwchen",
                "Malamute de Alaska",
                "Mastín",
                "Mastín Napolitano",
                "Mastín Tibetano",
                "Mudi",
                "Münsterländer grande",
                "Münsterländer pequeño",
                "Otterhound",
                "Papillon",
                "Parson Russell Terrier",
                "Pastor Alemán",
                "Pastor Australiano",
                "Pastor Belga",
                "Pastor Blanco Suizo",
                "Pastor Catalán",
                "Pastor de Anatolia",
                "Pastor de Beauce",
                "Pastor de los Pirineos",
                "Pastor de Shetland",
                "Pastor polaco de tierras bajas",
                "Pequeño Basset Grifón vendeano",
                "Pequeño Brabanzón",
                "Pequeño perro holandés para la caza acuática",
                "Pequinés",
                "Perdiguero de Burgos",
                "Perdiguero de Drente",
                "Perdiguero Portugués",
                "Perro crestado Chino",
                "Perro de Agua americano",
                "Perro de Agua español",
                "Perro de Agua portugués",
                "Perro de Canaan",
                "Perro de Castro Laboreiro",
                "Perro de Groenlandia",
                "Perro de montaña Appenzell",
                "Perro de montaña Bernés",
                "Perro de montaña de la Sierra de la Estrela",
                "Perro de montaña de los pirineos",
                "Perro de montaña del Atlas",
                "Perro de montaña Gran Suizo",
                "Perro de muestra alemán de pelo cerdoso",
                "Perro de muestra Danés",
                "Perro de pastor bergamasco",
                "Perro de pastor de Asia central",
                "Perro de pastor de Karst",
                "Perro de pastor de Rusia meridional",
                "Perro de pastor del Cáucaso",
                "Perro de pastor islandés",
                "Perro de pastor polaco de las Llanuras",
                "Perro de pastor polaco de Podhale",
                "Perro de pastor portugués",
                "Perro de pastor yugoslavo de Charplanina",
                "Perro Entlebucher",
                "Perro esquimal Americano",
                "Perro Esquimal Canadiense",
                "Perro Lobo Checoslovaco",
                "Perro Lobo de Sarloos",
                "Perro pastor croato",
                "Perro pastor Mallorquín",
                "Perro pastor Maremmano-Abruzzese",
                "Perro sin pelo del Perú",
                "Perro sin pelo Mexicano",
                "Perro Smous holandés",
                "Pinscher",
                "Pinscher austriaco",
                "Pinscher miniatura",
                "Plott Hound",
                "Podenco Canario",
                "Podenco ibicenco",
                "Podenco portugués",
                "Pointer",
                "Pointer alemán de pelo corto",
                "Pointer alemán de pelo duro",
                "Poitevin",
                "Pomerania",
                "Porcelaine",
                "Pudelpointer",
                "Puli",
                "Pumi",
                "Rafeiro del Alentejo",
                "Rastreador de Hannover",
                "Rastreador montañés de Baviera",
                "Retriever de La Bahía de Chesapeake",
                "Retriever de pelo liso",
                "Ridgeback de Rodesia",
                "Rottweiler",
                "Sabueso alemán",
                "Sabueso Artesiano",
                "Sabueso austriaco negro y fuego",
                "Sabueso de Bosnia de pelo cerdoso",
                "Sabueso de Hygen",
                "Sabueso de las montañas de Montenegro",
                "Sabueso de Smaland",
                "Sabueso de Transilvania",
                "Sabueso del Tirol",
                "Sabueso eslovaco",
                "Sabueso español",
                "Sabueso Estirio de pelo duro",
                "Sabueso Finlandés",
                "Sabueso francés tricolor",
                "Sabueso Halden",
                "Sabueso Italiano de pelo corto",
                "Sabueso Italiano de pelo duro",
                "Sabueso Noruego",
                "Sabueso Polaco",
                "Sabueso Schiller",
                "Sabueso Serbio",
                "Sabueso Suizo",
                "Sabueso tricolor serbio",
                "Saluki (galgo persa)",
                "Samoyedo",
                "San Bernardo",
                "Schapendoes neerlandés",
                "Schipperke",
                "Schnauzer",
                "Schnauzer Gigante",
                "Schnauzer Miniatura",
                "Sealyham Terrier",
                "Setter Gordon",
                "Setter Inglés",
                "Setter Irlandés",
                "Setter Irlandés rojo",
                "Setter Irlandés rojo y blanco",
                "Shar Pei",
                "Shiba",
                "ShihTzu",
                "Shikoku",
                "Silky Terrier",
                "Sloughi (galgo árabe)",
                "Spaniel continental enano",
                "Spaniel de Agua Irlandés",
                "Spaniel de Pont-Audemer",
                "Spaniel de Sussex",
                "Spaniel Picardo",
                "Spaniel Tibetano",
                "Spinone Italiano",
                "Spitz Alemán",
                "Spitz Finlandés",
                "Spitz Japonés",
                "Springer Spaniel Galés",
                "Springer Spaniel Inglés",
                "Spitz de Norrbotten",
                "Stabyhoun",
                "Staffordshire Bull Terrier",
                "Tchuvatch eslovaco",
                "Teckel",
                "Tejonero alpino",
                "Tejonero de Westfalia",
                "Terranova",
                "Terrier Australiano",
                "Terrier Bedlington",
                "Terrier Brasileño",
                "Terrier cazador alemán",
                "Terrier Cesky",
                "Terrier de Airedale",
                "Terrier de Norfolk",
                "Terrier de Skye",
                "Terrier Escocés",
                "Terrier Galés",
                "Terrier Irlandés",
                "Terrier Japonés",
                "Terrier Tibetano",
                "Thai Ridgeback Dog",
                "Tosa Inu",
                "Valhund Sueco",
                "Vizsla",
                "Volpino Italiano",
                "West Highland",
                "Wetterhound",
                "Wheaten Terrier",
                "Whippet",
                "Wolfhound Irlandés",
                "Yorkshire Terrier"
        };

        listItems=new ArrayList<>(Arrays.asList(items));

        adapter=new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.txtitem, listItems);

        listView.setAdapter(adapter);

    }

}