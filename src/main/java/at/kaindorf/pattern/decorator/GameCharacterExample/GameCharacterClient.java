package at.kaindorf.pattern.decorator.GameCharacterExample;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 12:32<br>
 */

public class GameCharacterClient {
    public static void main(String[] args) {
        GameCharacter character = new Monster();
        System.out.println(character.getDescription());

        character = new CombatPowerDecorator(character);
        System.out.println(character.getDescription());

        character = new SwordDecorator(new MagicPowerDecorator(new Cyborg()));
        System.out.println(character.getDescription());
    }
}
