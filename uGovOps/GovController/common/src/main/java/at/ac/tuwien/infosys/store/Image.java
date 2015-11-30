/*
 * Copyright (c) 2014 Technische Universitaet Wien (TUW), Distributed SystemsGroup E184.
 * 
 * This work was partially supported by the Pacific Controls under the Pacific Controls 
 * Cloud Computing Lab (pc3l.infosys.tuwien.ac.at)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Written by Michael Voegler
 */
package at.ac.tuwien.infosys.store;

import java.util.ArrayList;
import java.util.List;

public class Image {

	private List<String> deviceIds = new ArrayList<String>();
	private String imageId;
	private String storageFileName;
	private String storagePath;

	public Image(List<String> deviceIds, String imageId,
			String storageFileName, String storagePath) {
		super();
		this.deviceIds = deviceIds;
		this.imageId = imageId;
		this.storageFileName = storageFileName;
		this.storagePath = storagePath;
	}

	public Image() {
		super();
	}

	public List<String> getDeviceIds() {
		return deviceIds;
	}

	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getStorageFileName() {
		return storageFileName;
	}

	public void setStorageFileName(String storageFileName) {
		this.storageFileName = storageFileName;
	}

	public String getStoragePath() {
		return storagePath;
	}

	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((deviceIds == null) ? 0 : deviceIds.hashCode());
		result = prime * result + ((imageId == null) ? 0 : imageId.hashCode());
		result = prime * result
				+ ((storageFileName == null) ? 0 : storageFileName.hashCode());
		result = prime * result
				+ ((storagePath == null) ? 0 : storagePath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (deviceIds == null) {
			if (other.deviceIds != null)
				return false;
		} else if (!deviceIds.equals(other.deviceIds))
			return false;
		if (imageId == null) {
			if (other.imageId != null)
				return false;
		} else if (!imageId.equals(other.imageId))
			return false;
		if (storageFileName == null) {
			if (other.storageFileName != null)
				return false;
		} else if (!storageFileName.equals(other.storageFileName))
			return false;
		if (storagePath == null) {
			if (other.storagePath != null)
				return false;
		} else if (!storagePath.equals(other.storagePath))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Image [deviceIds=" + deviceIds + ", imageId=" + imageId
				+ ", storageFileName=" + storageFileName + ", storagePath="
				+ storagePath + "]";
	}

}
