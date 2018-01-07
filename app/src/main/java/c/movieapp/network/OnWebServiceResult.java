package c.movieapp.network;

import c.movieapp.utils.CommonUtilities;

/**
 * Created by abhi.
 */

public interface OnWebServiceResult {
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
