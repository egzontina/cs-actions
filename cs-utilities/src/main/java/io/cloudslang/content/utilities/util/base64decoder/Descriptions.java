/*
 * (c) Copyright 2019 EntIT Software LLC, a Micro Focus company, L.P.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0 which accompany this distribution.
 *
 * The Apache License is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.cloudslang.content.utilities.util.base64decoder;

public class Descriptions {

    public static class ConvertBytesToFile {
        public static final String FILE_PATH_DESC = "The absolute path with file name and extension that will be converted";
        public static final String CONTENT_BYTES_DESC = "The representation in bytes of the file that will be decoded";
        public static final String SUCCESS_DESC = "The file was decoded successfully";
        public static final String FAILURE_DESC = "There was an error while trying to decode the file";

        public static final String RETURN_RESULT_DESC = "The path of the decoded file or error message in case of failure";
        public static final String RETURN_CODE_DESC = "0 if success, -1 otherwise";
        public static final String EXCEPTION_DESC = "An error message in case there was an error while decoding the file";
        public static final String RETURN_PATH_DESC = "The path to the decoded file";


        public static final String BASE64_DECODER_TO_FILE = "Base64 Decoder to File";
    }

}