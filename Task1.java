Êþº¾   @ ¬
      java/lang/Object <init> ()V  java/util/ArrayList
    java/util/Random
 
   java/util/Scanner	      java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;  Enter length of your list: 
    ! " # java/io/PrintStream println (Ljava/lang/String;)V
  % & ' nextInt ()I
 
 ) & * (II)I
 , - . / 0 java/lang/Integer valueOf (I)Ljava/lang/Integer;
  2 3 4 add (Ljava/lang/Object;)Z
  6 " 7 (Ljava/lang/Object;)V
  9 :  close
 < = > ? @ Task1 minItem (Ljava/util/ArrayList;)V
 < B C @ maxItem
 < E F @ arithmeticOfItems
 < H I @ delEvenItems
  K L M sort (Ljava/util/Comparator;)V
  O P Q get (I)Ljava/lang/Object;
 S T U / V java/lang/String &(Ljava/lang/Object;)Ljava/lang/String;   X Y Z makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
  \ ] ^ printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  ` a ' size  X
  d e f iterator ()Ljava/util/Iterator; h i j k l java/util/Iterator hasNext ()Z h n o p next ()Ljava/lang/Object;
 , r s ' intValue  u Y v (D)Ljava/lang/String;
  x y Q remove Code LineNumberTable LocalVariableTable this LTask1; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; list Ljava/util/ArrayList; rnd Ljava/util/Random; sc Ljava/util/Scanner; n LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable  	Signature -(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V item Ljava/lang/Integer; sum D res 
SourceFile 
Task1.java BootstrapMethods 
    Y  $java/lang/invoke/StringConcatFactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; ¡ Minimum value of the list: 
 £ Maximum value of the list: 
 ¥ Arithmetic mean of the list 
 InnerClasses ¨ %java/lang/invoke/MethodHandles$Lookup ª java/lang/invoke/MethodHandles Lookup ! <           z   /     *· ±    {        |        } ~   	    z  *     d» Y· 	L» 
Y· M» Y² · N² ¶ -¶ $66¢ +,2¶ (¸ +¶ 1W§ÿç² +¶ 5-¶ 8+¸ ;+¸ A+¸ D+¸ G±    {   >        	  
 #  )  3  B  H  O  S  W  [  _  c  |   >  ,       d      \     T     I    ) ;          \        ÿ ,    
   ú  	 ? @  z   b     *¶ J² *¶ N¸ Rº W  ½ ¶ [W±    {            |                             	 C @  z   g     #*¶ J² **¶ _d¶ N¸ Rº b  ½ ¶ [W±    {          "  |       #            #          	 F @  z   Å     AH*¶ cN-¹ g  -¹ m À ,:'¶ qcH§ÿã'*¶ _oJ² )º t  ½ ¶ [W±    {            ! $ " ' # / $ @ % |   *   	      A      ?    /            A         ý  hú       	 I @  z        /*¶ _d< *¶ NÀ ,¶ qp 	*¶ wWÿ§ÿã² *¶ 5±    {       '  (  ) ! ' ' , . - |             /            /        
 ü ú                        ¢   ¤ ¦   
  § © « 