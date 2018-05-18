package game;


public class ZombieAi extends CreatureAi {
	private Creature player;
	
	public ZombieAi(Creature creature, Creature player) {
		super(creature);
		this.player = player;
	}

	public void onUpdate(){
		if (Math.random() >= 0.2)
			if (!creature.canSee(player.x, player.y, player.z))
				wander();
			else
				hunt(player);
	}
}
