import java.util.*;
public class DND
{
    /*
     * @author Caden Reece
     * @date 11.09.2023
     * 
     * 
     */
    
    
    //Array Fields, arrays for possible race, class, and subclass
    private String[] race_arr = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"};
    private String[] class_arr = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
    private String[] barbarianSubclasses = {"Berserker", "Totem Warrior"};
    private String[] bardSubclasses = {"College of Lore", "College of Valor"};
    private String[] clericSubclasses = {"Knowledge Domain", "Life Domain", "Light Domain", "Nature Domain", "Tempest Domain", "Trickery Domain", "War Domain"};
    private String[] druidSubclasses = {"Circle of the Land", "Circle of the Moon"};
    private String[] fighterSubclasses = {"Champion", "Battle Master", "Eldritch Knight"};
    private String[] monkSubclasses = {"Way of the Open Hand", "Way of the Shadow", "Way of the Four Elements"};
    private String[] paladinSubclasses = {"Oath of Devotion", "Oath of the Ancients", "Oath of Vengeance"};
    private String[] rangerSubclasses = {"Hunter", "Beast Master"};
    private String[] rogueSubclasses = {"Thief", "Assassin", "Arcane Trickster"};
    private String[] sorcererSubclasses = {"Draconic Bloodline", "Wild Magic"};
    private String[] warlockSubclasses = {"Pact of the Archfey", "Pact of the Fiend", "Pact of the Great Old One"};
    private String[] wizardSubclasses = {"School of Abjuration", "School of Conjuration", "School of Divination", "School of Enchantment", "School of Evocation", "School of Illusion", "School of Necromancy", "School of Transmutation"}; 
    private String[] fantasyNames = {"Aerion","Elowen","Thorne","Seraphina","Darian","Isolde","Lysander","Elysia","Caelum","Calista","Faelan","Aurelia","Rowan","Selene","Lorian","Morgana","Oberon","Arielle","Drystan","Valeria","Baelor","Talitha","Eldric","Elowyn","Galadriel","Caelan","Celestia","Finvarra","Thalassa","Lorien"};
    private String[] fantasyLocations = {"Eldoria","Rivenwood","Thundertop Keep","Silvermoon Vale","Avalon's Reach","Frostholm","Dragonspire Citadel","Sylvan Glade","Starhaven","Blackthorn Hollow","Mystic Woods","Stormholme","Crystalwyn","Glimmerfall","Whisperwind Grove","Havenbrook","Shadowfen","Emberfall","Ivorygate","Duskwild","Firepeak Hold","Moonshadow Retreat","Frostbarrow","Lorehaven","Ravenspire","Thornkeep","Aerondale","Wyrmslayer Hold","Silvershore","Ebonreach"};
    private String[] characterTraits = {"Uses foul language a lot","Is always polite and respectful","Has an insatiable curiosity","Suffers from a fear of the dark","Speaks multiple languages fluently","Has a mysterious past that they won't discuss","Obsessed with collecting rare and exotic items","Prone to telling tall tales and exaggerations","Can communicate with animals","Has a deep-seated distrust of magic","Always carries a lucky charm","Enjoys playing musical instruments","Is fascinated by ancient civilizations and artifacts","Has an uncanny ability to mimic voices","Hates getting dirty and always stays impeccably clean","Believes in the power of luck and chance","Practices a unique style of combat","Is haunted by recurring dreams or visions","Never reveals their true emotions","Can't resist a good challenge or bet","Has a fear of heights","Is a skilled artist or craftsman","Has a supernatural connection to a specific element","Suffers from chronic insomnia","Has a tendency to break into song or poetry","Possesses an affinity for magical illusions","Carries a mysterious, ancient artifact","Is a strict vegetarian or vegan","Has an imaginary friend that only they can see","Can't resist the temptation to pick locks and solve puzzles","Has a pet that is strangely intelligent or magical","Has a deep-seated fear of water","Carries a map that leads to a mythical treasure","Is haunted by a ghostly companion","Has a peculiar sense of fashion","Is a master of disguise and impersonation","Always carries a small library of books","Has an obsession with collecting rare herbs and plants","Is a loyal follower of a specific deity","Hates being indoors and prefers the open wilderness","Is a master of riddles and puzzles","Possesses a magical, sentient weapon","Has a penchant for inventing strange gadgets","Is a skilled acrobat and parkour enthusiast","Has a strong aversion to technology","Is a connoisseur of exotic foods and beverages","Has a supernatural ability to sense danger","Is cursed with extremely bad luck"};
    private String[] characterBackgrounds = {
        "An Orphan seeking the truth about their mysterious parentage",
        "A traveling merchant with a knack for negotiation and trade",
        "A local hero celebrated for a past deed, now seeking new challenges",
        "A folklorist collecting tales and legends from every corner of the realm",
        "A scholar of magical anomalies, studying the nature of arcane disturbances",
        "An estranged from a secretive and enigmatic society, searching for answers",
        "An artisan dedicated to perfecting their craft through exploration and practice",
        "A spiritual pilgrim on a quest for enlightenment and inner peace",
        "A sailor with a love for the open sea and a desire to explore distant lands",
        "A guide and protector of a small village, defending it from external threats",
        "A survivor of a natural disaster, determined to rebuild and start anew",
        "A guardian of a sacred grove, connected to nature and its mysteries",
        "An inventive tinkerer fascinated by mechanisms and technological wonders",
        "A Student of philosophy, questioning the nature of morality and existence",
        "An ex-gladiator who found freedom but still carries the scars of battle",
        "A bounty hunter tracking down individuals who have violated contracts",
        "A wandering poet composing verses that capture the essence of the world",
        "A mediator skilled in resolving conflicts and bringing about harmony",
        "Haunted by dreams of a forgotten past, trying to recover lost memories",
        "A nomadic storyteller sharing tales of courage and adventure",
        "A descendant of a lineage with a connection to a mythical creature",
        "A caretaker of a magical garden, cultivating plants with mystical properties",
        "A sole survivor of a cursed expedition, seeking redemption or revenge",
        "A guardian of a forgotten temple, sworn to protect its ancient secrets",
        "A strategist with a keen mind for tactics, honing their skills through challenges",
        "An explorer mapping uncharted territories and discovering hidden wonders",
        "A peacekeeper maintaining order in a troubled region",
        "An innkeeper with a knack for gathering information from patrons",
        "A reformed bandit trying to make amends for a life of crime",
        "A curator of a museum dedicated to preserving historical artifacts",
        "An sstronomer studying the stars and celestial events for hidden meanings",
        "A mystic with a connection to the ethereal, exploring the boundaries of reality",
        "A counselor providing guidance and support to those in need",
        "Adopted by a mystical being, asked to spread word of the mystical being across the realm",
        "A wise elder passing down traditional knowledge to younger generations",
        "A dreamwalker traversing the boundaries between the waking world and dreams",
        "A survivor of a plague, immune but scarred by the experience",
        "An acolyte of a forgotten religion, seeking to revive its practices",
        "A peaceful gardener cultivating plants with medicinal properties",
        "A former miner turned gemologist, searching for rare and valuable stones",
        "A relic hunter drawn to ancient ruins and artifacts",
        "A cartographer mapping out the intricacies of the world",
        "A aid worker assisting communities in need, driven by compassion",
        "A recovering addict striving for a new life and purpose",
        "A soothsayer with a talent for interpreting omens and visions"
    };
    
    //class descriptions
    private String barbarianDesc = "Barbarians are powerful and untamed warriors known for their primal instincts, raw strength, and fierce combat prowess. These individuals hail from various tribal or nomadic backgrounds, often living on the fringes of civilization. \nWhat sets them apart is their deep connection with nature and a unique ability to harness their inner fury in battle.";
    private String bardDesc = "Bards are versatile and enchanting individuals who wield the power of music, storytelling, and charisma to influence the world around them.\nThese gifted performers are often found in all walks of life, from wandering minstrels and court jesters to diplomats and lore keepers.";
    private String clericDesc = "Clerics are devoted and divine agents who serve as intermediaries between mortals and the higher powers that govern the universe. \nThese faithful individuals are bound by a deep connection to their chosen deities, embodying the virtues and principles of their faith.";
    private String druidDesc = "Druids are enigmatic nature-wielders who share a profound connection with the natural world. These mystical individuals draw power from the earth,\nthe elements, and the spirits of the wild, making them guardians of the environment and its untamed energies.";
    private String fighterDesc = "Fighters are battle-hardened and skillful warriors who excel in combat through their martial prowess and physical abilities. These fearless individuals are\nexperts in various forms of weaponry and combat techniques, and they rely on their strength, agility, and training to overcome adversaries.";
    private String monkDesc = "Monks are disciplined and enlightened individuals who have honed their bodies and minds to a profound degree. These ascetic warriors follow a path \nof inner harmony, harnessing their inner energy, and mastering the art of combat through intense training and meditation.";
    private String paladinDesc = "Paladins are noble and virtuous warriors who have dedicated themselves to a higher cause or moral code. \nThese devout individuals are not just skilled in combat but are also the embodiment of unwavering righteousness and justice.";
    private String rangerDesc = "Rangers are wilderness experts and skilled survivalists who possess an intimate connection with the natural world. These self-reliant\nindividuals are often found in the wild, away from the comforts of civilization, where they have learned to adapt and thrive.";
    private String rogueDesc = "Rogues are cunning and stealthy individuals who navigate the shadows and use their wits to achieve their goals. These versatile characters are masters of \nsubterfuge, espionage, and agility, relying on their sharp minds and quick reflexes.";
    private String sorcererDesc = "Sorcerers are individuals who possess an innate and magical connection to the very fabric of the world. Unlike wizards who study and\nlearn magic through extensive training, sorcerers are born with their mystical abilities, and their power flows through them like a force of nature.";
    private String warlockDesc = "Warlocks are individuals who have made mysterious pacts with otherworldly entities or ancient beings to gain access to arcane powers.\nThese individuals have forged supernatural connections that grant them unique abilities and knowledge beyond the comprehension of most mortals.";
    private String wizardDesc = "Wizards are studious and learned spellcasters who have acquired their magical abilities through years of dedicated education and research.\nThese intellectual individuals are the scholars and researchers of the arcane arts, wielding immense knowledge to manipulate the forces of magic.";
    
    
    //fields for the stat categories
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    

    //Random object, used to generate psuedo random numbers
    Random randNumGen = new Random();
    
    
    //simulates rolling a single die, used in the statCalcs() method
    private int rollSingleDie()
    {
        return randNumGen.nextInt(6)+1;
    }

    //statCalcs "rolls" four dice, drops the lowest value, sums the three dice and returns it, I use statCalcs method in rollStats
    private int statCalcs()
    {
        List<Integer> calcsList = new ArrayList<Integer>();

        //make four "rolls"
        for (int i = 0; i < 4; i++)
        {
            calcsList.add(rollSingleDie());
        }
        //removes the lowest roll out of the four (standar convention for rolling stats in Dungeons and Dragons)
        calcsList.remove(Collections.min(calcsList));
        int sum = 0;
        for (int i = 0; i < calcsList.size(); i++)
        {
            sum += calcsList.get(i);
        }
        
        return sum;
    }

    //returns a random class option from the array, class_arr
    public String getDndClass()
    {
        return class_arr[randNumGen.nextInt(class_arr.length)];
    }

    //returns a random race option from the array, race_arr
    public String getRace()
    {
        return race_arr[randNumGen.nextInt(race_arr.length)];
    }

    

    //Method that rolls for each stat and displays it as a 'stat sheet'
    public void rollAndDisplayStats()
    {
        strength = statCalcs();
        dexterity = statCalcs();
        constitution = statCalcs();
        intelligence = statCalcs();
        wisdom = statCalcs();
        charisma = statCalcs();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("  Strength: " + strength + "  Dexterity: " + dexterity + "  Constitution: " + constitution + "  Intelligence: " + intelligence + "  Wisdom: " + wisdom + "  Charisma: " + charisma);
        System.out.println("----------------------------------------------------------------------------------------------------");

    }

    //Method that displays the entire character sheet
    public void displayCharacter()
    {
        String charName = fantasyNames[randNumGen.nextInt(fantasyNames.length)];
        String charTitle = fantasyLocations[randNumGen.nextInt(fantasyLocations.length)];
        String charSubclass;
        String charClass = getDndClass();
        String charRace = getRace();
        String charDesc;
        String charBack = characterBackgrounds[randNumGen.nextInt(characterBackgrounds.length)];
        String charTrait = characterTraits[randNumGen.nextInt(characterTraits.length)];

        if(charClass.equals("Barbarian"))
            {
                charSubclass = barbarianSubclasses[randNumGen.nextInt(barbarianSubclasses.length)];
                charDesc = barbarianDesc;
            }
        else if (charClass.equals("Bard"))
            {
                charSubclass = bardSubclasses[randNumGen.nextInt(bardSubclasses.length)];
                charDesc = bardDesc;
            }

        else if (charClass.equals("Cleric"))
            {
                charSubclass = clericSubclasses[randNumGen.nextInt(clericSubclasses.length)];
                charDesc = clericDesc;
            }

        else if (charClass.equals("Druid"))
            {
                charSubclass = druidSubclasses[randNumGen.nextInt(druidSubclasses.length)];
                charDesc = druidDesc;
            }

        else if (charClass.equals("Fighter"))
            {
                charSubclass = fighterSubclasses[randNumGen.nextInt(fighterSubclasses.length)];
                charDesc = fighterDesc;
            }

        else if (charClass.equals("Monk"))
            {
                charSubclass = monkSubclasses[randNumGen.nextInt(monkSubclasses.length)];
                charDesc = monkDesc;
            }

        else if (charClass.equals("Paladin"))
            {
                charSubclass = paladinSubclasses[randNumGen.nextInt(paladinSubclasses.length)];
                charDesc = paladinDesc;
            }

        else if (charClass.equals("Ranger"))
            {
                charSubclass = rangerSubclasses[randNumGen.nextInt(rangerSubclasses.length)];
                charDesc = rangerDesc;
            }

        else if (charClass.equals("Rogue"))
            {
                charSubclass = rogueSubclasses[randNumGen.nextInt(rogueSubclasses.length)];
                charDesc = rogueDesc;
            }

        else if (charClass.equals("Sorcerer"))
            {
                charSubclass = sorcererSubclasses[randNumGen.nextInt(sorcererSubclasses.length)];
                charDesc = sorcererDesc;
            }

        else if (charClass.equals("Warlock"))
            {
                charSubclass = warlockSubclasses[randNumGen.nextInt(warlockSubclasses.length)];
                charDesc = warlockDesc;
            }

        else
            {
                charSubclass = wizardSubclasses[randNumGen.nextInt(wizardSubclasses.length)];
                charDesc = wizardDesc;
            }

        System.out.println("You are " + charName + " of " + charTitle + ", a "  + 
        charRace + ", " + charSubclass + " " + charClass + ", " + charBack + "\n" + charName + " " + 
        charTrait.toLowerCase() + "\n" + charDesc + "\n" + "\nHere are your stats!\n");
        rollAndDisplayStats();
        
    }
    //main method
    public static void main(String[] args) {
        Scanner prompter = new Scanner(System.in);
        DND drive = new DND();
        System.out.println("Hello! Welcome to the Dungeons and Dragons 5th edition character creator. (Only content from Player's Handbook)\nThis program can generate a random class, a random race, a random 5e stat sheet (with a simulated dice roll!), and create an entire random character!");
        System.out.println("To generate a random 5e class input 'class', to generate a race input 'race', to generate a random stat sheet input 'stats', to generate a character input 'character'!");
        String userIn = prompter.nextLine();
        int errorTimes = 0;
        while (true){
        
            if (userIn.toLowerCase().equals("class"))
            {
                System.out.println(drive.getDndClass());
            }

            else if (userIn.toLowerCase().equals("race"))
            {
                System.out.println(drive.getRace());
            }

            else if (userIn.toLowerCase().equals("stats"))
            {
                drive.rollAndDisplayStats();
            }

            else if (userIn.toLowerCase().equals("character"))
            {
                drive.displayCharacter();

            }

            else
            {
                errorTimes++;
                if (errorTimes <= 1)
                    System.out.println("Invalid Input");
                else if (errorTimes == 2)
                    System.out.println("Invalid Input, watch your spelling!");
                else if (errorTimes > 2)
                    System.out.println("Invalid Input, valid inputs are: 'race', 'class', 'stats', and 'character'");
                else
                    System.out.println("Invalid Input");
            }

            System.out.println("Please continue to generate! If you are done generating you can type 'close' to close the program!");
            userIn = prompter.nextLine();
        
            if(userIn.toLowerCase().equals("close")){
                break;
            }
        
        

    }
    prompter.close();      
    }
}