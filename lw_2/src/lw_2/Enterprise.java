package lw_2;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Vector;

public class Enterprise {
	
	Hashtable<Equipment, Vector<Worker>> equipment =
			new Hashtable<Equipment, Vector<Worker>>();
	
	private Enterprise() { }
	
	public static Enterprise Initialization() {
		Enterprise res = new Enterprise();
		Equipment newData = new Equipment();
		newData.eqName = "ПК-i5";
		newData.eqCode = "01-125";
		newData.eqType = EqType.ComputerEquipment;
		newData.eqCondition = EqCondition.InUse;
		res.equipment.put(
				newData,
				new Vector<>());
		newData = new Equipment();
		newData.eqName = "Монитор AOC";
		newData.eqCode = "01-264";
		newData.eqType = EqType.ComputerEquipment;
		newData.eqCondition = EqCondition.InStock;
		res.equipment.put(
				newData,
				new Vector<>());
		newData = new Equipment();
		newData.eqName = "Роутер Cisco";
		newData.eqCode = "02-111";
		newData.eqType = EqType.NetworkEquipment;
		newData.eqCondition = EqCondition.Decommissioned;
		res.equipment.put(
				newData,
				new Vector<>());
				
		return res;	
	}
	
	public void GetEquipment(String equipmentCode, Worker worker) {
		// Поиск оборудования с переданным кодом
		Optional<Entry<Equipment, Vector<Worker>>> find = 
				equipment.entrySet().stream()
				.filter(e->e.getKey().eqCode.equals(equipmentCode)).findFirst();
		
		// Если оборудование стоит на учёте
		if(find.isPresent()) {
			// Проверка доступности
			if(find.get().getKey().eqCondition == EqCondition.InStock) {
				find.get().getKey().eqCondition = EqCondition.InUse;
				find.get().getValue().add(worker);
				System.out.println("Выдача оборудования зафиксирована!\n");
			}
			else if (find.get().getKey().eqCondition == EqCondition.Decommissioned) {
				System.out.println("Оборудование выведено из эксплуатации!\n");
			}
			
			else
				System.out.println("Оборудование используется!\n");
		}
		else 
			System.out.println("Оборудование с таким кодом не учтено!\n");
	}
	
	public void HandOverEquipment( Worker worker) {
		System.out.println("Функция не реализована\n");
	}
	
	public void Catalog() {
		equipment.entrySet().stream().forEach(e->{
			Equipment tek = e.getKey();
			System.out.println(tek.eqName + "\n" + tek.eqType + "\n" + tek.eqCode + "\n");
		});
	}
	
	public void StartSession() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Учётная база предприятия готова к работе!\n");
		System.out.println("Идентификация сотрудника: ");
		System.out.print("ФИО >> ");
		String workerfullName = sc.nextLine();
		System.out.print("Код сотрудника >> ");
		String workerCode = sc.next();
		Worker user = new Worker(workerfullName, workerCode);
		System.out.println("\nПриветствуем, " + user.fullName + "!\n");
		int operation = 0;
		do {
			System.out.print("Выберите действие:\n1 - Вывод перечня оборудования\n" + 
					"2 - Запрос оборудования\n3 - Сдача оборудования\n" + 
					"0 - Выход\n" + "Ваш выбор >> ");
			operation = sc.nextInt();
			switch(operation) {
			case 1: Catalog(); break;
			case 2: 
				// Выбор оборудования
				System.out.print("Код оборудования >> ");
				String eqCode = sc.next();
				GetEquipment(eqCode, user);
				break;
			case 3:
				HandOverEquipment(user);
				break;
			default:break;
			}
		} while (operation != 0);
		
		sc.close();
		System.out.println("Учётная база предприятия. Работа завершена!");
	}
}
