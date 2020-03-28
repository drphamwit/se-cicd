package com.wkrzywiec.medium.noticeboard.service;

import com.wkrzywiec.medium.noticeboard.controller.dto.AuthorDTO;
import com.wkrzywiec.medium.noticeboard.entity.Author;
import com.wkrzywiec.medium.noticeboard.mapper.AuthorMapper;
import com.wkrzywiec.medium.noticeboard.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.wkrzywiec.medium.noticeboard.mapper.AuthorMapper.INSTANCE;

@Service
@RequiredArgsConstructor
public class FizzBuzz {
	String processNumber(int num)
	{
		if(num%15 == 0 )
		{
			return "FizzBuzz";
		}
		if(num%3 == 0 )
		{
			return "Fizz";
		}
		if (num%5 == 0)
		{
			return "Buzz";	
		}
		return String.valueOf(num);
	}
	
	String processNumbers (int[] numList)
	{
		String list = "";
		for (int i = 0; i < numList.length; i++)
		{
			list += processNumber(numList[i]);
			if (i < numList.length-1)
			{
				list += ", ";
			}
		}
		return list;
	}

}
