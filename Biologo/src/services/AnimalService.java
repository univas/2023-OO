package services;

import java.util.ArrayList;
import java.util.Date;

import models.Animal;

public class AnimalService {
	/*
	 * CRUD
	 * C => Criar (Create)
	 * R => Ler (Read) [ler 1 só, ler mais de um]
	 * U => Atualizar (Update)
	 * D => Excluir (Delete)
	 * */
	
	private static ArrayList<Animal> dados;
	
	public AnimalService() {
		if(AnimalService.dados == null)
		AnimalService.dados = new ArrayList<>();
	}
	
	// get 1
	public Animal get(String id) {
		for(Animal a : AnimalService.dados) {
			if(a.getId().equals(id)) {
				return a.clone();
			}
		}
		return null;
	}
	
	// get all
	public ArrayList<Animal> get(){
		return (ArrayList<Animal>)AnimalService.dados.clone();
	}
	
	// create
	public void create(Animal animal) {
		AnimalService.dados.add(animal.clone());
	}
	// update
	public void update(Animal animal) {
		for(Animal a : AnimalService.dados) {
			if(a.getId().equals(animal.getId())) {
				a.setCores(animal.getCores());
				a.setEspecie(animal.getEspecie());
				a.setFoto(animal.getFoto());
				a.setLocal(animal.getLocal());
				a.setPatas(animal.getPatas());
				a.setPelo(animal.isPelo());
				a.setPenas(animal.isPenas());
				a.setPeso(animal.getPeso());
				a.setRegistro(animal.getRegistro());
				a.setTamanho(animal.getTamanho());
			}
		}
	}
	// delete
	public void delete(String id) {
		Animal animalASerExcluido = null;
		for(Animal a : AnimalService.dados) {
			if(a.getId().equals(id)) {
				animalASerExcluido = a;
			}
		}
		
		if(animalASerExcluido != null) {
			AnimalService.dados.remove(animalASerExcluido);
		}
	}
	
	// Conta quantos registros foram inseridos
	public int count() {
		return AnimalService.dados.size();
	}
	
	// Obtem os animais com pelos
	public ArrayList<Animal> getComPelos(){
		ArrayList<Animal> lista = new ArrayList<Animal>();
		for(Animal a : AnimalService.dados) {
			if(a.isPelo()) {
				lista.add(a.clone());
			}
		}
		return lista;
	}
	
	// Obtem os animais com penas
	public ArrayList<Animal> getComPenas(){
		ArrayList<Animal> lista = new ArrayList<Animal>();
		for(Animal a : AnimalService.dados) {
			if(a.isPenas()) {
				lista.add(a.clone());
			}
		}
		return lista;
	}
}
