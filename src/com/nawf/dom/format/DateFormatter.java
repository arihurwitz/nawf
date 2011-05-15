package com.nawf.dom.format;
/*  Copyright 2011 Justin Hughey
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter implements Formatter<Date> {

	private SimpleDateFormat sdf = null;

	public DateFormatter(String format){
		this.sdf = new SimpleDateFormat(format);
	}

	@Override
	public String format(Date value) {
		return sdf.format(value);
	}

}
