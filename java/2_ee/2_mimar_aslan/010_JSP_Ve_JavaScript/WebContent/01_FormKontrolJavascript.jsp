<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Javascript ve JSP</title>
</head>

<script type="text/javascript">
	function formuKontrolEdenFonksiyon(form){
		if(form.adi.value==''){
			alert("Adı alanını boş geçemezsiniz.");
			return false;
		}
		if(form.soyadi.value==''){
			alert("Soyadı alanını boş geçemezsiniz.");
			return false;
		}
		if(form.telefon.value==''){
			alert("Telefon alanını boş geçemezsiniz.");
		}
		if(form.cinsiyet.value==''){
			alert("Cinsiyet alanını boş geçemezsiniz.");
			return false;
		}
		if (form.adres.value == '') {
			alert("Adres alanını boş geçemezsiniz.");
			return false;
		}
		if(form.ulke.value==''){
			alert("Ülke alanını boş geçemezsiniz.");
			return false;
		}
		if(form.meslek.value==''){
			alert("Meslek alanını boş geçemezsiniz.");
			return false;
		}
		if(form.tecrube.value==''){
			alert("Tecrübe alanını boş geçemezsiniz.");
			return false;
		}
	}
</script>

<body>

	<p align="left">
		<b>Kayıt Formu</b>
	</p>

	<form action="01_FormKontroluJavascriptiAl.jsp" method="post"
		name="formKontroluJavascript"
		onsubmit="return formuKontrolEdenFonksiyon(document.formKontroluJavascript);">

		<table border="1" id="table1">
			<tr>
				<td width="33%">Adi</td>
				<td width="67%"><input type="text" name="adi" size="30"
					id="adi"></td>
			</tr>
			<tr>
				<td width="33%">Soyadı</td>
				<td width="67%"><input type="text" name="soyadi" size="30"
					id="soyadi"></td>
			</tr>
			<tr>
				<td width="33%">Telefon</td>
				<td width="67%"><input type="text" name="telefon" size="30"
					id="telefon"></td>
			</tr>
			<tr>
				<td width="33%">Cinsiyet</td>
				<td>
					<input name="cinsiyet" type="radio" value="Bayan">Bayan
					<input name="cinsiyet" type="radio" value="Erkek" checked>Erkek
				</td>
			</tr>
			<tr>
				<td width="33%">Adres</td>
				<td><textarea name="adres" cols="20" rows="2" id="adres"></textarea></td>
			</tr>
			<tr>
				<td width="33%">Ülke</td>
				<td><select name="ulke" size="1" id="ulke">
						<option value="" selected>Lütfen ülkenizi seçiniz.</option>
						<option value="Turkiye">Türkiye</option>
						<option value="Ukrayna">Ukrayna</option>
						<option value="Amerika">Amerika</option>
						<option value="Ingiltere">İngiltere</option>
						<option value="Norvec">Norveç</option>
						<option value="Kanada">Kanada</option>
						<option value="Rusya">Rusya</option>
				</select></td>
			</tr>
			<tr>
				<td width="33%">Meslek</td>
				<td><select name="meslek" size="1" id="meslek">
						<option value="" selected>Lütfen mesleğinizi seçiniz.</option>
						<option value="Bilgisayar Mühendisi">Bilgisayar Mühendisi</option>
						<option value="Avukat">Avukat</option>
						<option value="Ogretmen">Öğretmen</option>
						<option value="Akademisyen">Akademisyen</option>
						<option value="Doktor">Doktor</option>
						<option value="Hemsire">Hemşire</option>
						<option value="Ekomomist">Ekomomist</option>
				</select></td>
			</tr>
			<tr>
				<td width="33%">Tecrübe Yılı</td>
				<td><select name="tecrube" size="1" id="tecrube">
						<option value="">Lütfen tecrübe yılınızı seçiniz.</option>
						<option value="0  -  2  YIL">0 - 2 YIL</option>
						<option value="2  -  5  YIL">2 - 5 YIL</option>
						<option value="5  -  7  YIL">5 - 7 YIL</option>
						<option value="7  -  9  YIL">7 - 9 YIL</option>
						<option value="9  -  11 YIL">9 - 11 YIL</option>
						<option value="11 -  ...">11 - ...</option>
				</select></td>
			</tr>
		</table>
		
		<p>
			<input type="submit" value="Değerleri Gönder" name="GonderDugmesi">
			<input type="reset" value="Sıfırla" name="SifirlaDugmesi">
		</p>
	</form>

</body>
</html>