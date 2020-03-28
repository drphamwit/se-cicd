package com.wkrzywiec.medium.noticeboard.service;

import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO;
import com.wkrzywiec.medium.noticeboard.entity.Author;
import com.wkrzywiec.medium.noticeboard.repository.AuthorRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static com.wkrzywiec.medium.noticeboard.util.TestDataFactory.*;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Unit tests of FizzBuzz class")
public class FizzBuzzTest {
	@Test
	void shouldProcessNumber() {
		FizzBuzz fb = new FizzBuzz();
		
		assertEquals("1", fb.processNumber(1));
		assertEquals("2", fb.processNumber(2));
		assertEquals("Fizz", fb.processNumber(3));
		assertEquals("Fizz", fb.processNumber(6));
		assertEquals("Buzz", fb.processNumber(5));
		assertEquals("FizzBuzz", fb.processNumber(15));
	}

	@Test
	void shouldProcessNumbers() {
		FizzBuzz fb = new FizzBuzz();
		
		assertEquals("1", fb.processNumbers(new int[] {1}));
		assertEquals("1, 2", fb.processNumbers(new int[] {1, 2}));
	}

}
