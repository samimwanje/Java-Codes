/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import java.util.ArrayList;


public class Main extends Application {

	private ArrayList<NorseGod> norseGods;					// Array Holding NorseGod objects.
	private BorderPane layout = new BorderPane();			// Layout.
	private ListView<String> menu;							// Selection menu.
	private Stage window;									// Window
	private	Scene scene;									// Stage
	private String selected;								// Used to find out which God that has been selected.
	
	@Override
	public void start(Stage primaryStage) {
		
		window = primaryStage;								// variable used for priamryStage.
		window.setTitle("Norse Gods");						// Set title of program.
		
		
		
		norseGods = new ArrayList<NorseGod>();				// Create ArrayHoldning NorseGods.
		addGod(); 											// Create and add gods to array.
	
		
		// Menu handling...
		menu = new ListView<String>(); 						// Create a menu, and add items from array to menu.
		for(int i = 0; i < norseGods.size(); i++)			// Add NorseGods names from Array to menu.
		menu.getItems().add(norseGods.get(i).getName());		
		menu.setOnMouseClicked(event -> handleEvent() );	// Event when mouse is clicked on menu.
		
		// Style handling
		Label header = new Label("Norse Gods and other Beings");			// HeadText.
		header.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30)); 	// Make head text bold and size 30.


		HBox headHolder = new HBox(); 										// Create new horizontal box.
		headHolder.getChildren().add(header);								// Add header to horizontal Box.
		
		VBox verticalMenu = new VBox(200);									// Create vertical box.
		verticalMenu.setPadding(new Insets(0,10,0,0));						// Add some gaps...
		verticalMenu.getChildren().add(menu);								// Add menu to vertical Box.
		verticalMenu.setPrefSize(150, 437);									// prefWidth, prefHeight

		layout.setLeft(verticalMenu);										// Add menu to left.
		layout.setTop(headHolder);											// Add header to top.
		layout.setPadding(new Insets(0,10,10,10));							// Set gaps on layout...
		layout.setStyle("-fx-background-color: #FFFF; -fx-font-weight: bold");	// Set white background.
		
		 	scene = new Scene(layout,675,440);								// New Scene and add layout to it.
		    window.setScene(scene);											// Add Scene to window.
		    window.setResizable(false);										// Make window unresizeable.
		    window.show();													// Show new window.
		    
		    
	}
	

	
	private void handleEvent() {
	
		selected = menu.getSelectionModel().getSelectedItems().toString();
		selected = selected.replaceAll("[\\-\\]\\[\\^]","");
				
		// Create three text lines.
		Text name = new Text();
		Text race = new Text();
		Text info = new Text();
		int currentSize = 0;

		for(int i = 0; i < norseGods.size(); i++) {
			
			if(norseGods.get(i).getName().equals(selected)) {						// Check which NorseGod is selected.

				name.setText(norseGods.get(i).getName());							// Create text with name.
				race.setText( norseGods.get(i).getRace() );							// Create text with race.
				info.setText(norseGods.get(i).getDesc());							// Create text with information.
				currentSize = norseGods.get(i).getDesc().length();					// Get the current length of the text.
				break; } 
							}
		
		
		
		name.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20)); 				// Set font name.
		race.setFont(Font.font("Comic Sans MS", 15)); 								// Set font race.
		info.setFont(new Font("San Francisco", 13));								// Text Style.
		info.setWrappingWidth(479);													// Make text more compact.										
									
			
		VBox contenent = new VBox();												// Create verticalBox
		contenent.getChildren().addAll(name,race,info);								// Add name,race and info to vertical box.
		contenent.setPadding(new Insets(5,25,25,5));								// Set the gaps of verticalbox.
		
		
		// Create a scrollbox.	
		ScrollPane scrollPane = new ScrollPane(); 							
		scrollPane.setContent(contenent);											// Add scrollPane to vertical box..
		
	
    
		//scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);							// Make only vertical scroll visible.
		if(currentSize > 1155) 											// Check if scrollBar should be displayed.
        scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		else
		scrollPane.setVbarPolicy(ScrollBarPolicy.NEVER);	
			
			
		scrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);							// Make only vertical scroll visible.
		scrollPane.setFitToWidth(true);												// Make text inside Scrollbar fit.
		scrollPane.setMaxSize(500, 380);											// Max scrollPane size.
		layout.setCenter(scrollPane);												// Add scrollPain to layout.
		window.show();																// Display Window, with new Stage.
		
		
	}
	
	// This metod is used to handle the events from each choice in the menu 
	private void addGod() {
		// Add frigg.
		NorseGod Frigg = new NorseGod("Frigg","Asgard", "Frigg is a goddess in Germanic mythology. In Norse mythology, the source of most surviving information about her, she is associated with foresight and wisdom, and dwells in the wetland halls of Fensalir. In wider Germanic mythology, she is known in Old High German as Frīja, in Langobardic as Frea, in Old English as Frīg, and in Old Saxon as Frī. Nearly all sources portray her as the wife of the god Odin.\r\n" + 
				"\r\n" + 
				"In Old High German and Old Norse sources, she is specifically connected with Fulla, but she is also associated with the goddesses Lofn, Hlín, Gná, and ambiguously with the Earth, otherwise personified as an apparently separate entity Jörð (Old Norse \"Earth\"). The children of Frigg and Odin include the gleaming god Baldr. Due to significant thematic overlap, scholars have proposed a connection to the goddess Freyja.\r\n" + 
				"\r\n" + 
				"The English weekday name Friday (ultimately meaning 'Frigg's Day') bears her name. After Christianization, the mention of Frigg continued to occur in Scandinavian folklore. During modern times, Frigg has appeared in popular culture, has been the subject of art and receives veneration in Germanic Neopaganism.");
		norseGods.add(Frigg);
		
		
		
		NorseGod Loki = new NorseGod("Loki","Giant ", "Loki is a god in Norse mythology. Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also refers to Odin as the father of Váli twice, and Váli is found mentioned as a son of Loki only once.\r\n" + 
				"\r\n" + 
				"Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes behaves maliciously towards them. Loki is a shape shifter and in separate incidents appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of the god Baldr, and eventually, Váli binds Loki with the entrails of one of his sons. In both the Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter the god Heimdallr, and the two will slay each other.\r\n" + 
				"\r\n" + 
				"Loki is referred to in the Poetic Edda, compiled in the 13th century from earlier traditional sources; the Prose Edda and Heimskringla, written in the 13th century by Snorri Sturluson; the Norwegian Rune Poems, in the poetry of skalds, and in Scandinavian folklore. Loki may be depicted on the Snaptun Stone, the Kirkby Stephen Stone, and the Gosforth Cross. Scholars have debated Loki's origins and role in Norse mythology, which some have described as that of a trickster god. Loki has been depicted in or is referenced in a variety of media in modern popular culture.");
		norseGods.add(Loki);
		
		
		// Add Odin.
		NorseGod Odin = new NorseGod("Odin","Æsir ", "Odin (Óðinn in Old Norse), possibly the most revered yet enigmatic of all "
				+ "Norse gods, was regarded as the king of the Æsir tribe of gods. Historically, Odin had always been prominent "
				+ "in the pantheon of Germanic mythology, as is evident from Tacitus’ late 1st-century AD work Germania (where Odin "
				+ "is seen as the equivalent of Roman god Mercury). And given his mythical eminence over the cultural framework of the "
				+ "Germanic people, Odin was associated with various (and often antithetical) aspects, ranging from wisdom, healing, "
				+ "royalty to death, sorcery, and even frenzy.\r\n" + 
				"\r\n" + 
				"Pertaining to the attribute of wisdom, the character of Odin mirroring his ‘contradictory’ aspects, was often portrayed"
				+ " as the haggard wanderer who relentlessly seeks knowledge, in spite of his regal status as the ruler of the Asgard. One of the stories epitomizes the god’s thirst for knowledge and wisdom where Odin willingly gouges out one of his eyes as a sacrifice for Mimir, a shadowy being who possesses unparalleled knowledge because of its consumption of the water from the Well of Urd. Mimir in return offers Odin a draught from the well that draws water from the roots of the Yggdrasil, the cosmic tree that binds the nine worlds of Norse mythology.\r\n" + 
				"\r\n" + 
				"On the other hand, the one-eyed Odin also has a sinister (albeit in a nascent level) side to him, given the entity’s "
				+ "proclivity for provocation that leads to conflicts and wars. Essentially, when perceived as a war-god, Odin was seen "
				+ "as the epitome of battle frenzy and chaos – aspects that were favored by the warlords and berserkers. In any case, in "
				+ "our modern-day context, the name of Odin is related to Wednesday, since the word is derived from wodnesdæg (“Woden’s Day”), "
				+ "with Odin being referred to as Wōden in Old English and Wōtan in Old High German.");
		norseGods.add(Odin);
		
		// Add Thor.
		NorseGod Thor = new NorseGod("Thor","Æsir ", "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the Germanic expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.\r\n" + 
				"\r\n" + 
				"Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, "
				+ "where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from "
				+ "traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, "
				+ "Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn "
				+ "Járnsaxa, and is generally described as fierce eyed, red haired and red bearded.[1] With Sif, Thor fathered the"
				+ " goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded,"
				+ " he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr."
				+ " Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr "
				+ "(that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the"
				+ " mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr."
				+ " Thor's exploits, including his relentless slaughter of his foes and fierce battles with "
				+ "the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of "
				+ "Ragnarök—are recorded throughout sources for Norse mythology.\r\n" + 
				"\r\n" + 
				"Into the modern period, Thor continued to be acknowledged in rural "
				+ "folklore throughout Germanic-speaking Europe. Thor is frequently referred to in place names, the day of the week Thursday bears "
				+ "his name (modern English Thursday derives from Old English Þūnresdæg, 'Þunor's day'), and names stemming from the pagan period containing"
				+ " his own continue to be used today, particularly in Scandinavia. Thor has inspired numerous works of art and references to Thor appear in "
				+ "modern popular culture. Like other Germanic deities, veneration of Thor is revived in the modern period in Heathenry.");
			
		norseGods.add(Thor);
		
		
		
		// Add Heimdallr
		NorseGod Heimdallr = new NorseGod("Heimdallr","Æsir ", "In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\r\n" + 
				"\r\n" + 
				"Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations, scholars have produced various theories about the nature of the god, including his apparent relation to rams, that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates.");
		
		norseGods.add(Heimdallr);
		
		
		
		NorseGod Týr = new NorseGod("Týr","Æsir ", "Týr is the namesake of the Tiwaz rune (ᛏ), a letter of the runic alphabet corresponding to the Latin letter T. By way of the process of interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic languages, including English. Interpretatio romana, in which Romans interpreted other gods as forms of their own, generally renders the god as Mars, the ancient Roman war god, and it is through that lens that most Latin references to the god occur. For example, the god may be referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription, reflecting a strong association with the Germanic thing, a legislative body among the ancient Germanic peoples.\r\n" + 
				"\r\n" + 
				"In Norse mythology, from which most surviving narratives about gods among the Germanic peoples stem, Týr sacrifices his arm to the monstrous wolf Fenrir, who bites off his limb while the gods bind the animal. Týr is foretold to be consumed by the similarly monstrous dog Garmr during the events of Ragnarök. In Old Norse sources, Týr is alternately described as the son of the jötunn Hymir (in Hymiskviða) or of the god Odin (in Skáldskaparmál). Lokasenna makes reference to an unnamed otherwise unknown consort, perhaps also reflected in the continental Germanic record (see Zisa (goddess)).\r\n" + 
				"\r\n" + 
				"Various place names in Scandinavia refer to the god, and a variety of objects found in England and Scandinavia may depict the god or invoke him.");
		norseGods.add(Týr);
		
		
		
		
		// Freyja
		NorseGod Freyja = new NorseGod("Freyja","Vanir ", " Freyja is a goddess associated with love, beauty, fertility, sex, war, gold, and seiðr. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother Freyr, her father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\r\n" + 
				"\r\n" + 
				"Freyja rules over her heavenly field, Fólkvangr, where she receives half of those who die in battle. The other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís.\r\n" + 
				"\r\n" + 
				"Freyja is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; in the Prose Edda and Heimskringla, composed by Snorri Sturluson in the 13th century; in several Sagas of Icelanders; in the short story "
				+ "\"Sörla þáttr\"; in the poetry of skalds; and into the modern age in Scandinavian folklore.\r\n" + 
				"\r\n" + 
				"Scholars have debated whether Freyja and the goddess Frigg ultimately stem from a single goddess common among the Germanic "
				+ "peoples; connected her to the valkyries, female battlefield choosers of the slain; and analyzed her relation to other goddesses "
				+ "and figures in Germanic mythology, including the thrice-burnt and thrice-reborn Gullveig/Heiðr, the goddesses Gefjon, Skaði, Þorgerðr "
				+ "Hölgabrúðr and Irpa, Menglöð, and the 1st century CE \"Isis\" of the Suebi.");
		norseGods.add(Freyja);
		
		
		// Add Bestla
		NorseGod Bestla =  new NorseGod("Bestla","Dwarf ", "Bestla is a jötunn in Norse mythology, and the mother of the gods Odin, Vili and Vé (by way of Borr). She is also the sister of an unnamed man who assisted Odin, and the daughter (or granddaughter depending on the source) of the jötunn Bölþorn. Odin is frequently called \"Bestla's son\" in both skaldic verses and the Poetic Edda.[1]\r\n" + 
				"\r\n" + 
				"Bestla is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources, "
				+ "the Prose Edda, written in the 13th century by Snorri Sturluson, and in the poetry of skalds. Scholars "
				+ "have commented on the obscurity of the figure's name and have proposed various "
				+ "theories to explain the role and origin the giantess.");
		norseGods.add(Bestla);
		
		
	
	}


	public static void main(String[] args) {
		launch(args);
		
	}
	
	
	
	
}
