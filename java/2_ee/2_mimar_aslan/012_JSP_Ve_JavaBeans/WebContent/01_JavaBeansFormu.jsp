<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.lang.String"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaBeans ve Form İşlemi</title>
</head>
<body>

	<h1>JavaBeans ve Form İşlemi</h1>
	
	<form action="01_JavaBeansFormunuAlanForm.jsp"
		  name="bilgiformu"
		  method="post">
		<table border="1"
			   id="bilgitablosu">
			<tr>
				<td width="33%">Adı</td>
				<td width="67%"><input type="text" name="adi" size="30" id="adi"></td>
			</tr>
			<tr>
				<td width="33%">Soyadı</td>
				<td width="67%"><input type="text" name="soyadi" size="30" id="soyadi"></td>
			</tr>
			<tr>
				<td width="33%">Telefonu</td>
				<td width="67%"><input type="text" name="telefon" size="30" id="telefonIdsi"></td>
			</tr>
			<tr>
				<td width="33%">Cinsiyeti</td>
				<td>
					<input type="radio" name="cinsiyet" value="Bayan">Bayan
					<input type="radio" name="cinsiyet" value="Erkek" checked>Erkek
				</td>
			</tr>
			<tr>
				<td width="33%">Adres</td>
				<td width="67%"><textarea name="adres" cols="20" rows="2" id="adres"></textarea></td>
			</tr>
			<tr>
				<td width="33%">Ülke</td>
				<td width="67%">
					<select name="ulke" size="1" id="ulke">
						<option value="" selected>Lütfen ülkenizi seçiniz</option>
						<option value="Turkiye">Türkye</option>
						<option value="Ukrayna">Ukrayna</option>
						<option value="Norvec">Norveç</option>
						<option value="Kanada">Kanada</option>
						<option value="Rusya">Rusya</option>
					</select>
				</td>
			</tr>
			<tr>
				<td width="33%">Meslek</td>
				<td width="67%">
					<select name="meslek" size="1" id="meslek">
						<option value="" selected>Lütfen mesleginizi seçiniz</option>
						<option value="Bilgisayar Muhendisi">Bilgisayar Mühendisi</option>
						<option value="Asci">Aşcı</option>
						<option value="Futbolcu">Futbolcu</option>
						<option value="Ev Hanimi">Ev Hanımı</option>
						<option value="Berber">Berber</option>
					</select>
				</td>
			</tr>
			<tr>
				<td width="33%">Tecrübe Yılı</td>
				<td width="67%">
					<select name="tecrube" size="1" id="tecrube">
						<option value="" selected>Lütfen tecrübe seçiniz</option>
						<option value="0 - 2 YIL">0 - 2 YIL</option>
						<option value="2 - 5 YIL">2 - 5 YIL</option>
						<option value="5 - 7 YIL">5 - 7 YIL</option>
						<option value="7 - 9 YIL">7 - 9 YIL</option>
						<option value="7 - 11 YIL">9 - 11 YIL</option>
					</select>
				</td>
			</tr>
			<tr>
				<td width="33%">Yaşı</td>
				<td width="67%"><input type="text" name="yasi" size="30" id="yasi"></td>
			</tr>
		</table>
		
		<p>
			<input type="submit" value="Değerleri Gönder" name="GonderDugmesi">
			<input type="reset" value="Sıfırla" name="SifirlaDugmesi">
		</p>
		
	</form>

</body>
</html>