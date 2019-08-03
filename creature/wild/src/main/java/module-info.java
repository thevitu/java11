import com.thevitu.creature.animal.Animal;
import com.thevitu.creature.wild.Eagle;
import com.thevitu.creature.wild.Lion;
import com.thevitu.creature.wild.Tiger;

module creature.wild {
	provides Animal with Tiger, Lion, Eagle;
	requires creature.animal;
}