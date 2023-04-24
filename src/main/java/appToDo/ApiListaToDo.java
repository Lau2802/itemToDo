package appToDo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/ejemplo-todo")
public class ApiListaToDo {
	
	private Collection<ItemToDo> items = Collections.synchronizedCollection(new ArrayList<>());
	
	@GetMapping("lista-items")
	public Collection<ItemToDo> listarItems(@RequestParam(value = "completadas", defaultValue = "false") boolean completadas){
		//publicaciones.stram().filter(pub ->pub.getLikes() > 0).collect(Collectors.toList());
				
		Collection<ItemToDo> nueva = new ArrayList<>();
		if (completadas) {
			for (ItemToDo a:items) {
				if (a.getCompletado()) {
					nueva.add(a);
				}
			}
		} else {
			nueva=items;
		}
		return nueva;
		
	}
	
	
	@PostMapping("nuevo-item")
	public Collection<ItemToDo> nuevoItems(@RequestBody ItemToDo nuevo){
		nuevo.setNumero(items.size()+1);
		items.add(nuevo);
		
		return items;
		
	}
	
	@PatchMapping("marcar-item")
	public ItemToDo marcarItems(@RequestBody ItemToDo itemtodo) {
		ItemToDo sale=null;
		try {
			sale=new ItemToDo();
			((ArrayList<ItemToDo>) items).get(itemtodo.getNumero()).setCompletado(true);
			sale=((ArrayList<ItemToDo>) items).get(itemtodo.getNumero());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		return sale;	
	}
	
	
}
