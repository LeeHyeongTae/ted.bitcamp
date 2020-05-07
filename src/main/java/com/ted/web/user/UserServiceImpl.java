package com.ted.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.ted.web.util.Data;
import javax.swing.JOptionPane;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

		@Autowired UserDao userDao;

		@Override
		public List<User> findAll() {
			return userDao.selectAll();
		}

		@Override
		public User findOne(String userid) {
			return userDao.selectOne(userid);
		}


}











