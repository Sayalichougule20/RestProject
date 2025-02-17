package com.symbiosis.RestProject.model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Music {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
		private String name;
		@Column(length=50000000)
		private byte[] imageByte;
		public Music() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Music(String name, byte[] imageByte) {
			super();
			this.name = name;
			this.imageByte = imageByte;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public byte[] getImageByte() {
			return imageByte;
		}
		public void setImageByte(byte[] imageByte) {
			this.imageByte = imageByte;
		}
		@Override
		public String toString() {
			return "Music [id=" + id + ", name=" + name + ", imageByte=" + Arrays.toString(imageByte) + "]";
		}
}

